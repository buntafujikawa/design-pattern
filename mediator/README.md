# Mediatorパターン
複雑に絡み合うオブジェクトたち相互の通信をやめ、Mediator役に情報を集中させることによって処理を整理するデザインパターン

## 登場人物
- Mediator(調停者、仲介者)の役  
Mediatorインターフェース
- ConcreateMediator(具体的な調停者、仲介者)の役  
LoginFrameクラス
- Colleague(同僚)の役  
Colleagueインターフェース
- ConcreateColleague(具体的な同僚)の役  
ColleagueButtonクラス、ColleagueTextFieldクラス、ColleagueCheckboxクラス

## クラス図
![mediator](https://user-images.githubusercontent.com/11749585/34570226-6ec6ab0e-f1ae-11e7-8137-08c75a472087.jpg)
