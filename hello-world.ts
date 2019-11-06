interface person
{
    fname:string
    lname:string
    getFullname():string

}

class student implements person
{
    getFullname(): string{
        return this.fname+" "+this.lname
    }
     fname: string;   
     lname: string;
     roll:number
     house:string
     constructor(fname ,lname,roll,house)
     {
         this.fname=fname
         this.lname=lname
         this.roll=roll
         this.house=house
     }
}
var x:person
x=new student("surya","sikha",115,"green")
let y=x.getFullname()
console.log(y);
