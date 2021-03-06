plugins {
	kotlin("multiplatform") version "1.5.10"
	id("ru.capjack.publisher") version "1.0.0"
}

group = "ru.capjack.tool"

repositories {
	mavenCentral()
	mavenCapjack()
}

kotlin {
	jvm {
		compilations.all { kotlinOptions.jvmTarget = "11" }
	}
	
	sourceSets {
		get("commonMain").dependencies {
			api("ru.capjack.tool:tool-reflect:1.3.1")
			implementation("ru.capjack.tool:tool-logging:1.5.0")
		}
		get("commonTest").dependencies {
			implementation(kotlin("test"))
		}
		
		get("jvmTest").dependencies {
			implementation("ch.qos.logback:logback-classic:1.2.+")
		}
	}
}