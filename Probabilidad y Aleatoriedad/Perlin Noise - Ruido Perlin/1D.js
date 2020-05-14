var au = 0.01;
var inicio = 0;
function setup(){
  createCanvas(640, 480)
}
function draw(){
  background(51)
  var t = inicio;
  noFill()
  beginShape()
  for (var x = 0; x < width; x++) {
    stroke(255);
    //var y = random(height)
    var y = noise(t)*height
    //var y = height/2 + sin(t)*height/2
    //var y = noise(t)*400 + height/2 + sin(t)*height/2

    vertex(x, y)
    t += au
  }
  endShape()
  inicio += au

}
