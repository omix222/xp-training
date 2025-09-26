package com.company.xp;

/**
 * BowlingGame - 継続的統合練習問題4
 *
 * 要件:
 * - ボーリングゲームのスコア計算
 * - ストライク（10ピン）: 次の2投の合計をボーナス加点
 * - スペア（2投で10ピン）: 次の1投をボーナス加点
 * - 10フレーム制
 * - 最終フレームは特殊ルール
 *
 * XPプラクティス:
 * - Continuous Integration
 * - Small Releases
 * - Testing（複雑なビジネスロジックのテスト）
 */
public class BowlingGame {

    private int[] rolls = new int[21]; // 最大21投（10フレーム + 最終フレームの追加投球）
    private int currentRoll = 0;

    public void roll(int pins) {
        // TODO: 投球を記録してください
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public int score() {
        // TODO: 合計スコアを計算してください
        // ストライクとスペアのボーナス計算に注意
        throw new UnsupportedOperationException("Not implemented yet");
    }

    // リファクタリング用のヘルパーメソッド
    private boolean isStrike(int rollIndex) {
        // TODO: ストライク判定
        throw new UnsupportedOperationException("Not implemented yet");
    }

    private boolean isSpare(int rollIndex) {
        // TODO: スペア判定
        throw new UnsupportedOperationException("Not implemented yet");
    }

    private int strikeScore(int rollIndex) {
        // TODO: ストライクスコア計算
        throw new UnsupportedOperationException("Not implemented yet");
    }

    private int spareScore(int rollIndex) {
        // TODO: スペアスコア計算
        throw new UnsupportedOperationException("Not implemented yet");
    }

    private int normalScore(int rollIndex) {
        // TODO: 通常スコア計算
        throw new UnsupportedOperationException("Not implemented yet");
    }
}