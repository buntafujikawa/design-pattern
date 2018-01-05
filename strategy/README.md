# Prototypeパターン
アルゴリズムを実装した部分を移譲することにより、アルゴリズムを容易に切り替えることのできるデザインパターン

## 登場人物
- Strategy(戦略)の役  
Strategyインターフェース
- ConcreateStrategy(具体的戦略)の役  
WinningStrategyクラス、ProbStrategyクラス
- Context(文脈)の役  
Playerクラス

## クラス図
![strategy](https://user-images.githubusercontent.com/11749585/34570234-705b42d6-f1ae-11e7-8295-e55e006e7705.jpg)
