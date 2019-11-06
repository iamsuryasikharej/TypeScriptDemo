var student = /** @class */ (function () {
    function student(fname, lname, roll, house) {
        this.fname = fname;
        this.lname = lname;
        this.roll = roll;
        this.house = house;
    }
    student.prototype.getFullname = function () {
        return this.fname + " " + this.lname;
    };
    return student;
}());
var x;
x = new student("surya", "sikha", 115, "green");
var y = x.getFullname();
console.log(y);
