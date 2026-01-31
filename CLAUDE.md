# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Project Overview

XP (Extreme Programming) training project for junior developers. Contains 4 kata-style coding exercises (FizzBuzz, Calculator, StringCalculator, BowlingGame) that teach XP practices (TDD, pair programming, refactoring, continuous integration). All source implementations are stubs throwing `UnsupportedOperationException`; test assertions are commented out with TODO markers. Students implement both the production code and uncomment/write tests.

## Build Commands

```bash
mvn compile                        # Compile
mvn test                           # Run all tests
mvn test -Dtest=FizzBuzzTest       # Run a single test class
mvn test -Dtest=FizzBuzzTest#shouldReturnFizzForMultiplesOfThree  # Run a single test method
mvn clean compile                  # Clean rebuild
mvn test jacoco:report             # Generate coverage report (target/site/jacoco/index.html)
mvn package                        # Build JAR
```

## Tech Stack

- **Java 17** (source and target)
- **Maven** build system
- **JUnit 5** (5.10.0) with `@DisplayName` annotations in Japanese
- **Mockito** (5.5.0) available for mocking
- **JaCoCo** (0.8.8) for code coverage

## Architecture

Single package `com.company.xp` with four independent exercise modules:

| Class | Test Class | XP Focus |
|---|---|---|
| `FizzBuzz` | `FizzBuzzTest` | TDD (Red-Green-Refactor) |
| `Calculator` | `CalculatorTest` | Pair Programming |
| `StringCalculator` | `StringCalculatorTest` | Refactoring / Small Releases |
| `BowlingGame` | `BowlingGameTest` | Continuous Integration |

Supporting files:
- `XPReflection.java` - Reflection guide on XP values/principles (no code to implement)
- `XPAssessmentTest.java` - Discussion-based XP understanding assessment

The exercises are designed to be completed in order: FizzBuzz -> Calculator -> StringCalculator -> BowlingGame. Each builds on XP concepts from the previous.

## Conventions

- Test `@DisplayName` annotations are written in Japanese
- Javadoc comments describe XP practices relevant to each class
- Stub methods use `throw new UnsupportedOperationException("Not implemented yet")`
- Test TODOs follow the pattern: `// TODO: テストを実装してください` with commented-out assertion examples
