var au = 0.01
function setup(){
  createCanvas(200, 200)
  pixelDensity(1)
}
function draw(){
  var ty = 0
  loadPixels()
  for (var y = 0; y < height; y++){
    var tx = 0;
    for (var x = 0; x < width; x++){
      var index = (x + y * width) * 4
      var color = random(255)
      var color = noise(tx, ty)*255
      pixels[index+0] = color
      pixels[index+1] = color
      pixels[index+2] = color
      pixels[index+3] = 255

      tx+= au
    }
    ty += au
  }
  updatePixels();
}
