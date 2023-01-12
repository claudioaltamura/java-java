import org.gradle.api.tasks.testing.logging.TestLogEvent

plugins {
  java
  idea
  eclipse
    id("com.diffplug.spotless") version "6.12.1"
    id("com.github.ben-manes.versions") version "0.44.0"

}

repositories {
  mavenCentral()
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

dependencies {

	testImplementation("org.assertj:assertj-core:3.24.1")

    testImplementation("org.hamcrest:hamcrest:2.2")

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.9.2")

    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.9.2")
}

val test by tasks.getting(Test::class) {
  useJUnitPlatform()
  testLogging {
    events = setOf(TestLogEvent.PASSED, TestLogEvent.SKIPPED, TestLogEvent.FAILED)
  }
}