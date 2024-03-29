plugins {
	kotlin("multiplatform") version "1.8.21"
	id("ru.capjack.publisher") version "1.1.0"
}

group = "ru.capjack.tool"

repositories {
	mavenCentral()
	mavenCapjack()
}

kotlin {
	jvm {
		jvmToolchain(17)
	}
	
	sourceSets {
		get("commonMain").dependencies {
			implementation("ru.capjack.tool:tool-logging:1.8.0")
			implementation("ru.capjack.tool:tool-reflect:1.6.0")
		}
		get("commonTest").dependencies {
			implementation(kotlin("test"))
		}
		
		get("jvmTest").dependencies {
			implementation("ch.qos.logback:logback-classic:1.4.7")
		}
	}
}