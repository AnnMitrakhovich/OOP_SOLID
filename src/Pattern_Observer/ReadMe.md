Паттерн Наблюдатель относится к поведенческим паттернам проектирования. 
Специфика поведенческих паттернов проектирования состоит в создании коммуникаций между классами и/или объектами.
* Цель паттерна — построить отношения со многими объектами таким образом, чтобы изменение состояния одного из них автоматически стало известным остальным и чтобы они также автоматически обновлялись. 
Точнее говоря, этот паттерн хочет получать информацию обо всех событиях, происходящих в системе. 

Observer is a behavioral design pattern that lets you define a subscription mechanism to notify multiple objects about any events that happen to the object they’re observing.
this mechanism consists of 1) an array field for storing a list of references to subscriber objects and 2) several public methods which allow adding subscribers to and removing them from that list.
Now, whenever an important event happens to the publisher, it goes over its subscribers and calls the specific notification method on their objects.

Real apps might have dozens of different subscriber classes that are interested in tracking events of the same publisher class. You wouldn’t want to couple the publisher to all of those classes. 
Besides, you might not even know about some of them beforehand if your publisher class is supposed to be used by other people.

That’s why it’s crucial that all subscribers implement the same interface and that the publisher communicates with them only via that interface. 
This interface should declare the notification method along with a set of parameters that the publisher can use to pass some contextual data along with the notification.