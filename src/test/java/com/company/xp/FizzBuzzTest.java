package com.company.xp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

/**
 * FizzBuzzのテストクラス
 *
 * TDDの流れ:
 * 1. 失敗するテストを書く (Red)
 * 2. テストが通る最小限のコードを書く (Green)
 * 3. リファクタリングする (Refactor)
 */
@DisplayName("FizzBuzz TDD練習")
class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @BeforeEach
    void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    @DisplayName("通常の数字はそのまま文字列で返す")
    void shouldReturnNumberAsString() {
        // TODO: 最初のテストを実装してください
        // assertEquals("1", fizzBuzz.convert(1));
    }

    @Test
    @DisplayName("3で割り切れる数字はFizzを返す")
    void shouldReturnFizzForMultiplesOfThree() {
        // TODO: テストを実装してください
    }

    @Test
    @DisplayName("5で割り切れる数字はBuzzを返す")
    void shouldReturnBuzzForMultiplesOfFive() {
        // TODO: テストを実装してください
    }

    @Test
    @DisplayName("3と5の両方で割り切れる数字はFizzBuzzを返す")
    void shouldReturnFizzBuzzForMultiplesOfThreeAndFive() {
        // TODO: テストを実装してください
    }

    @Test
    @DisplayName("範囲指定で連続した結果を取得できる")
    void shouldGenerateSequence() {
        // TODO: 範囲指定のテストを実装してください
    }
}