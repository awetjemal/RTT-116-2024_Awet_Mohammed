var modal = document.getElementById('id01');

// When the user clicks anywhere outside of the modal, close it
window.onclick = function(event) {
  if (event.target == modal) {
    modal.style.display = "none";
  }
}

const listObject = {
  colors : ['White', 'Yellow', 'Red', 'Green', 'Blue', 'Black'],
  continents : ['Africa', 'Europe', 'Asia', 'N. America', 'S. America', 'Australia'],
  animals : ['Ant', 'Bee', 'Cat', 'Dog', 'Elephant', 'Frog']
}
let selectionList = document.getElementById('list-types');
let listItems = document.getElementById('list-items');

function listSelected(){
  let list = listObject[selectionList.value] ;
  if(list){
    listItems.innerHTML = "";
    for(let i = 0; i < list.length; i++){
      
      const listElement = document.createElement('li');
      listElement.innerHTML = list[i];
      listItems.appendChild(listElement);
      // console.log(list[i]);
    }
  }else{
    listItems.innerHTML = "";
  }
  
}

const favCol = document.getElementsByName('fav_col');
const body = document.querySelector('#body');
const wrap = document.querySelector('#wrapper');
const head = document.querySelector('#header');

favCol.forEach((e) =>{
  e.addEventListener('click', changeColor);
    // console.log(e.checked)
    // console.log(e.value)
}
);

function changeColor(){
  for(let i = 0; i < favCol.length; i++){
    let rad = favCol[i];
    if(rad.checked && rad.value == "RED"){
      // body.setAttribute('style', 'background-color: coral');
      // body.setAttribute('style', 'color: white');
      body.style.backgroundColor= '#c94c4c';
      wrap.style.backgroundColor = '#eea29a';
      head.style.backgroundColor= '#c94c4c';
      body.style.color= 'black';
      // console.log("Change the backround to red and the fonts too");
    }
    else if(rad.checked && rad.value == "GREEN" ){
      body.style.backgroundColor= '#82b74b';
      wrap.style.backgroundColor = '#b5e7a0';
      head.style.backgroundColor= '#82b74b';
      body.style.color= '#3e4444';
      // console.log("Change the backround to dark green and the fonts too");
    }
    else if(rad.checked && rad.value == "BLUE"){
      body.style.backgroundColor= '#034f84';
      head.style.backgroundColor= '#034f84';
      wrap.style.backgroundColor = '#92a8d1';
      body.style.color= '#50394c';
      // console.log("change to blue like sky");
    }
  }
}

// console.log(favCol);
