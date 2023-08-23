const con=document.querySelector('.container');

let isIn=true;     
let isOut=false;   

var span;        


con.addEventListener('mouseenter',(e)=>{
    if(isIn){
        let inX=e.clientX-e.target.offsetLeft;
        let inY=e.clientY-e.target.offsetTop;

        let el=document.createElement('span');
        el.style.left=inX+'px';
        el.style.top=inY+'px';
       
        con.appendChild(el);

        $('.container span').removeClass('out');  
        $('.container span').addClass('in');       
        span=document.querySelector('.container span');
        isIn=false;     
        isOut=true;    
    }
})

con.addEventListener('mouseleave',(e)=>{
    if(isOut){
       
        let outX=e.clientX-e.target.offsetLeft;
        let outY=e.clientY-e.target.offsetTop;

        $('.container span').removeClass('in');     
        $('.container span').addClass('out');      
       
        $('.out').css('left',outX+'px');
        $('.out').css('top',outY+'px');

        isOut=false;    
       
        setTimeout(() => {
            con.removeChild(span);      
            isIn=true;                
        }, 500);
    }
    
})

