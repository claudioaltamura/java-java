import org.gradle.api.tasks.testing.logging.TestLogEvent

plugins {
  java
  idea
  eclipse
	id ("com.github.ben-manes.versions") version "0.36.0"
}

repositories {
  jcenter()
}

dependencies {
	//implementation ("io.reactivex.rxjava2:rxjava:2.2.20")
	implementation ("io.reactivex:rxjava:1.3.8")

	testImplementation("org.assertj:assertj-core:3.18.1")

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.7.0")

    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.7.0")
}

java {
  sourceCompatibility = JavaVersion.VERSION_11
  targetCompatibility = JavaVersion.VERSION_11
}


val test by tasks.getting(Test::class) {
  useJUnitPlatform()
  testLogging {
    events = setOf(TestLogEvent.PASSED, TestLogEvent.SKIPPED, TestLogEvent.FAILED)
  }
}