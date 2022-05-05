//2 stack
class TwoStack{
int a[] ;
int size; int top1,top2;

TwoStack(int n){
size = n;
a = new int [n];
top1 = n/2+1;
top2 = n/2;
}

void push1(int x){

if(top1>0){
top1--;
a[top1] =x;
}
else{
System.out.print("Stack Overflow"+"By"+x);
return;
}

}

void push2(int x){

if(top2<size-1){
top2++;
a[top2] = x;
}
else{
//System.out.print("Stack overflow"+"by"+x);
return;
}
}

int pop1(){

if(top1<=size/2){
int x = a[top1];
top1++;
return x;
}
else{
System.out.print("Stack Underflow");
return 0 ;
}
}
int pop2(){
	if(top2>=size/2+1){
		int x = a[top2];
		top2--;
		return x;
	}
	else{
		System.out.print("Stack Underflow");
return 1;
	}
}
}
class DemoStack{
	public static void main(String args[]){
	TwoStack ts = new TwoStack(5);
	ts.push2(10);
	ts.push2(15);
	ts.push1(11);
	ts.push2(7);
	ts.push2(40);
	
	System.out.println("Popped element from stack1 is "+ts.pop1());
	
	System.out.println("Popped element from stack2 is "+ts.pop2());
}
}
