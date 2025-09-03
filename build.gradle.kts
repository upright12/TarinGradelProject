plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation("org.seleniumhq.selenium:selenium-java:4.23.0")

    // Cucumber (BDD)
    testImplementation("io.cucumber:cucumber-java:7.17.0")
    testImplementation("io.cucumber:cucumber-testng:7.17.0")

    // TestNG (test runner)
    testImplementation("org.testng:testng:7.10.2")

    // Logging
    implementation("org.slf4j:slf4j-simple:2.0.13")

    // (Optional) Excel data-driven testing with Apache POI
    implementation("org.apache.poi:poi:5.3.0")
    implementation("org.apache.poi:poi-ooxml:5.3.0")
}

tasks.test {
    useJUnitPlatform()
}