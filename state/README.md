# Stateパターン
システムの各状態を個別のクラスで表現するデザインパターン

状態遷移を誰が管理すべきかという点には注意が必要

## 登場人物
- State(状態)の役  
Stateインターフェース
- ConcreateState(具体的な状態)の役  
DayStateクラスやNightStateクラス
- Context(状況、前後関係、文脈)の役  
SafeFrameクラス

## クラス図
![state](https://user-images.githubusercontent.com/11749585/34570233-70304f5e-f1ae-11e7-8dba-406388caa0d4.jpg)
