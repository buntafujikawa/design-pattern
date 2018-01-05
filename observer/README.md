# Observerパターン
オブジェクトの状態変化を変化を他のオブジェクトに通知するデザインパターン

## 登場人物
- Subject(被験者)の役  
NumberGeneratorクラス
- ConcreateSubject(具体的な被験者)の役  
RandomNumberGeneratorクラス
- Observer(観察者)の役  
Observerインターフェース
- ConcreateObserver(具体的な観察者)の役  
DigitObserverクラス、GraphObserverクラス

## クラス図
![observer](https://user-images.githubusercontent.com/11749585/34570229-6f9d682e-f1ae-11e7-991d-0818720590a7.jpg)
