plugins {
	java
	id("org.springframework.boot") version "3.1.2"
	id("io.spring.dependency-management") version "1.1.2"
}

group = "E-commerce"
version = "0.0.1-SNAPSHOT"

java {
	sourceCompatibility = JavaVersion.VERSION_17
}

 configurations {
	compileOnly {
		extendsFrom(configurations.annotationProcessor.get())
	}
}

 repositories {
	mavenCentral()
}

 dependencies {
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
	implementation("org.springframework.boot:spring-boot-starter-mail")
	 implementation ("io.jsonwebtoken:jjwt-impl:0.11.5")
	 implementation ("io.jsonwebtoken:jjwt-api:0.11.5")
	 implementation ("io.jsonwebtoken:jjwt-jackson:0.11.5")
	implementation("org.springframework.boot:spring-boot-starter-security")
//	 implementation("org.springframework.boot:spring-boot-starter-validation")
	implementation("org.springframework.boot:spring-boot-starter-web")
	compileOnly("org.projectlombok:lombok")
	developmentOnly("org.springframework.boot:spring-boot-devtools")
	 runtimeOnly("com.mysql:mysql-connector-j")
//	 implementation("com.squareup.okhttp3:okhttp:4.9.1")
	 annotationProcessor("org.projectlombok:lombok")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testImplementation("org.springframework.security:spring-security-test")
}

 tasks.withType<Test> {
	useJUnitPlatform()
}
