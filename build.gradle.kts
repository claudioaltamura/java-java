import org.gradle.api.tasks.testing.logging.TestLogEvent

plugins {
  java
  idea
  eclipse
    id("com.diffplug.spotless") version "7.0.2"
    id("com.github.ben-manes.versions") version "0.52.0"

}

repositories {
  mavenCentral()
}

java {
    sourceCompatibility = JavaVersion.VERSION_21
    targetCompatibility = JavaVersion.VERSION_21
}

dependencies {

	testImplementation("org.assertj:assertj-core:3.26.3")

    testImplementation("org.hamcrest:hamcrest:3.0")

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.11.3")

    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.11.3")
}

val test by tasks.getting(Test::class) {
  useJUnitPlatform()
  testLogging {
    events = setOf(TestLogEvent.PASSED, TestLogEvent.SKIPPED, TestLogEvent.FAILED)
  }
}