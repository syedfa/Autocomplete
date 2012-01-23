<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ajax auto-suggest / auto-complete | BrandSpankingNew</title>
 
<script type="text/javascript" src="js/bsn.AutoSuggest_2.1.3.js" charset="utf-8"></script>
 
<link rel="stylesheet" href="css/autosuggest_inquisitor.css" type="text/css" media="screen" charset="utf-8" />
 
<style type="text/css">
 
        body {
                font-family: Lucida Grande, Arial, sans-serif;
                font-size: 10px;
                text-align: center;
                margin: 0;
                padding: 0;
        }
        
        table
        {
                border: 1px;
                background-color: #999;
                font-size: 10px;
        }
        tr
        {
                vertical-align: top;
        }
        th
        {
                text-align: left;
                background-color: #ccc;
        }
        th,
        td
        {
                padding: 2px;
                font-family: Lucida Grande, Arial, sans-serif;
                font-size: 1.2em;
        }
        td
        {
                background-color: #fff;
        }
        
        a {
                font-weight: bold;
                text-decoration: none;
                color: #f30;
        }
        
        a:hover {
                color: #fff;
                background-color: #f30; 
        }
        
        #wrapper {
                width: 600px;
                margin: 10px auto;
                text-align: left;
        }
        
        #content {
                font-size: 1.2em;
                line-height: 1.8em;
        }
        
        #content h1 {
                font-size: 1.6em;
                border-bottom: 1px solid #ccc;
                padding: 5px 0 5px 0;
        }
 
        #content h2 {
                border-top: 1px solid #ddd;
                padding-top: 5px;
                font-size: 1.2em;
                margin-top: 3em;
        }
        
        #content h3 {
                font-size: 1.1em;
                margin-top: 3em;
        }
 
        small
        {
                color: #999;
        }
 
 
 
 
 
 
        label
        {
                font-weight: bold;
        }
 
        
        
        
        /*
        the parent element of an autosuggest input should have a relative position
        */
        .asholder
        {
                position: relative;
        }
 
 
 
 
 
 
        
</style>
 
 
</head>
<body>
 
<div id="wrapper">
<div id="content">
 
 
<div>
 
<form method="get" action="" class="asholder">
    <input type="hidden" id="testid" value="" style="font-size: 10px; width: 20px;" disabled="disabled" size="20" />
        <input style="width: 200px" type="hidden" id="testinput" value="" size="20" /> 
        <input type="hidden" value="submit" />
</form>
</div>
 
 
 
<h3>Example (XML)</h3>
 
<div>
<form method="get" action="" class="asholder">
        <label for="testinput_xml">Person</label>
        <input type="text" id="testinput_xml" value="" style="width:300px" size="20" /> 
        <br /><br /><input type="submit" value="submit" />
</form>
</div>
 
 
</div>
</div>
 
 
<script type="text/javascript">

	    
        var options = {
                script:"TestServlet?json=false&limit=6&",
                varname:"input",
                json:false,
                shownoresults:true,
                cache:false,
                maxresults:6,
                callback: function (obj) { document.getElementById('testid').value = obj.id; }
        };
        var as_json = new bsn.AutoSuggest('testinput', options);
        
        
        var options_xml = {
                script: function (input) { return "TestServlet?input="+input+"&limit=6" + "&testid="+document.getElementById('testid').value; },
                varname:"input",
                shownoresults:false,
                delay:1,
                timeout:5000,
                cache:false
        };
        var as_xml = new bsn.AutoSuggest('testinput_xml', options_xml);
    </script>
 
 
 
</body>
</html>