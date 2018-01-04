# Bridgeパターン
「機能のクラス階層」と「実装のクラス階層」の2つの独立したクラス階層の橋渡しを行うデザインパターン

## 登場人物
- Abstraction(抽象化)の役  
Displayクラス
- RefinedAbstraction(改善した抽象化)の役  
CountDisplayクラス
- Implementor(実装者)の役  
DisplayImplクラス
- ConcreateImplementor(具体的な実装者)の役  
StringDisplayImplクラス

## クラス図
![bridge](https://user-images.githubusercontent.com/11749585/34566018-59c24c94-f1a0-11e7-8ac0-3dd3a2253c82.jpg)
