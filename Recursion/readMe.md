# Recursion 
#### in recurtion we should have two case 
        1- Base Case 
            - WE ARE DONE 
        2- Recursion Case 
            - CALL THE FUNCTION 
#### Example
    `
    fun countDown(element: Int): Int{
    if (element <= 0) 
        return 0
    else{
        print("${element} ")
        return countDown(element - 1)  
        }
}
`
# what is the base case and the recursion case in this function ? 
<h2>the base case is</h2>
`
if (element <= 0) 
return 0
`

 <h2>and the recursion case is</h2>

`
else{
print("${element} ")
return countDown(element - 1)  
}
`