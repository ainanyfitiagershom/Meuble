const allattribute = document.querySelectorAll("[mother]") ;
const child = document.querySelectorAll("[data-mother]") ;
const arrow = document.querySelectorAll("[img-data]") ;
allattribute.forEach(element => {
    element.addEventListener('click' , ()=>{
        arrow.forEach(down=>{
            if(element.getAttribute("mother") == down.getAttribute("img-data")){
                down.classList.toggle('active');
            }
        })
        child.forEach(data_mother=>{
            if(element.getAttribute("mother") == data_mother.getAttribute("data-mother")){
                data_mother.classList.toggle('notactive')
            }
        })
    })
});