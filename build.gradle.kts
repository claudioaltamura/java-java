import org.gradle.api.tasks.testing.logging.TestLogEvent

plugins {
  java
  idea
  eclipse
    id("com.diffplug.spotless") version "6.5.0"
    id("com.github.ben-manes.versions") version "0.42.0"

}

repositories {
  mavenCentral()
}

dependencies {

	testImplementation("org.assertj:assertj-core:3.22.0")

    testImplementation("org.hamcrest:hamcrest:2.2")

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.2")

    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.2")
}

val test by tasks.getting(Test::class) {
  useJUnitPlatform()
  testLogging {
    events = setOf(TestLogEvent.PASSED, TestLogEvent.SKIPPED, TestLogEvent.FAILED)
  }
}