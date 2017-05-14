package first;
public class histogram {
int top=-1;
void push(int s[],int x){
	top++;
	s[top]=x;
}
void pop(){
	top--;
}
boolean isempty(){
	if(top==-1)return true;
	return false;
}

public static void main(String[] args){
	histogram h=new histogram();
	int[]s=new int[10];
	int a[]={8,7,6,600,600,8,7};
	int i=0,area,maxArea=0,tp;
	while(i<7){
	if(h.isempty()||a[s[h.top]]<=a[i])h.push(s,i++);
	else {
		tp=s[h.top];
		h.pop();
		area=a[tp] * (h.isempty() ? i : i - s[h.top] - 1);
		if (maxArea < area)
            maxArea = area;
	}
	}
	while (h.isempty() == false)
    {
        tp = s[h.top];
        h.pop();
        area = a[tp] * (h.isempty() ? i : i - s[h.top] - 1);
 
        if (maxArea < area)
            maxArea = area;
    }
 
    System.out.println(maxArea);
}
}

