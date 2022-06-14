/*  *********** compare string **********  */
	// https://www.tutorialspoint.com/What-is-the-best-way-to-compare-two-strings-in-JavaScript
  if (process.env.APP_MIN_VERSION.localeCompare(appVersion) > 0  ) { 
       // ie process.env.APP_MIN_VERSION - appVersion > 0
       // ie process.env.APP_MIN_VERSION > appVersion
  }


/*  *********** filter an array **********  */
   var words = ['spray', 'limit', 'elite', 'exuberant', 'destruction', 'present'];
   const result = words.filter(word => word.length > 6);
   console.log(result);  
   // expected output: Array ["exuberant", "destruction", "present"]


/*  *********** NodeJs Commands **********  */ 

// launch an application defining env variables 
   // https://medium.com/the-node-js-collection/making-your-node-js-work-everywhere-with-environment-variables-2da8cdf6e786
      $ PORT=8626 APP_MIN_VERSION=1.1.2 node app semiLocal

