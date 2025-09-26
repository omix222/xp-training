package com.company.xp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

/**
 * BowlingGameのテストクラス
 *
 * 継続的統合練習:
 * - 各テストが独立して実行できること
 * - 複雑なビジネスロジックを段階的にテスト
 * - エッジケースの網羅
 */
@DisplayName("BowlingGame 継続的統合練習")
class BowlingGameTest {

    private BowlingGame game;

    @BeforeEach
    void setUp() {
        game = new BowlingGame();
    }

    @Test
    @DisplayName("すべてガターボール（0ピン）の場合")
    void shouldScore0ForAllGutterBalls() {
        // TODO: 20投すべて0ピンの場合のテスト
        // rollMany(20, 0);
        // assertEquals(0, game.score());
    }

    @Test
    @DisplayName("すべて1ピンの場合")
    void shouldScore20ForAllOnes() {
        // TODO: 20投すべて1ピンの場合のテスト（スコア20）
    }

    @Test
    @DisplayName("1つのスペアがある場合")
    void shouldCalculateSpareCorrectly() {
        // TODO: 1フレーム目でスペア、3投目に3ピン倒した場合
        // スコア: 10 + 3 + 残り投球の合計
    }

    @Test
    @DisplayName("1つのストライクがある場合")
    void shouldCalculateStrikeCorrectly() {
        // TODO: 1フレーム目でストライク、2,3投目で3,4ピン倒した場合
        // スコア: 10 + 3 + 4 + 残り投球の合計
    }

    @Test
    @DisplayName("パーフェクトゲーム（すべてストライク）")
    void shouldScore300ForPerfectGame() {
        // TODO: 12投すべてストライクの場合（スコア300）
        // rollMany(12, 10);
        // assertEquals(300, game.score());
    }

    @Test
    @DisplayName("すべてスペアの場合")
    void shouldCalculateAllSparesCorrectly() {
        // TODO: すべてのフレームでスペア（5,5）+ 最終フレームで5ピン
        // スコア: 150
    }

    @Test
    @DisplayName("最終フレームでストライクの場合")
    void shouldHandleTenthFrameStrike() {
        // TODO: 最終フレームでストライクの特殊ルールのテスト
    }

    @Test
    @DisplayName("最終フレームでスペアの場合")
    void shouldHandleTenthFrameSpare() {
        // TODO: 最終フレームでスペアの特殊ルールのテスト
    }

    @Test
    @DisplayName("複雑なスコアパターン")
    void shouldCalculateComplexScorePattern() {
        // TODO: ストライク、スペア、通常投球が混在するパターン
    }

    // テストヘルパーメソッド
    private void rollMany(int times, int pins) {
        for (int i = 0; i < times; i++) {
            game.roll(pins);
        }
    }

    private void rollSpare() {
        game.roll(5);
        game.roll(5);
    }

    private void rollStrike() {
        game.roll(10);
    }
}