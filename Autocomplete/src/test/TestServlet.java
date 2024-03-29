package test;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServlet
 */
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		ArrayList results = new ArrayList(); 
        int j = 0; 
        int numLimit; 
        String [] names = {"Ãdams, Egbert",
							"Altman, Alisha",
							"Archibald, Janna",
							"Auman, Cody",
							"Bagley, Sheree",
							"Ballou, Wilmot",
							"Bard, Cassian",
							"Bash, Latanya",
							"Beail, May",
							"Black, Lux",
							"Bloise, India",
							"Blyant, Nora",
							"Bollinger, Carter",
							"Burns, Jaycob",
							"Carden, Preston",
							"Carter, Merrilyn",
							"Christner, Addie",
							"Churchill, Mirabelle",
							"Conkle, Erin",
							"Countryman, Abner",
							"Courtney, Edgar",
							"Cowher, Antony",
							"Craig, Charlie",
							"Cram, Zacharias",
							"Cressman, Ted",
							"Crissman, Annie",
							"Davis, Palmer",
							"Downing, Casimir",
							"Earl, Missie",
							"Eckert, Janele",
							"Eisenman, Briar",
							"Fitzgerald, Love",
							"Fleming, Sidney",
							"Fuchs, Bridger",
							"Fulton, Rosalynne",
							"Fye, Webster",
							"Geyer, Rylan",
							"Greene, Charis",
							"Greif, Jem",
							"Guest, Sarahjeanne",
							"Harper, Phyllida",
							"Hildyard, Erskine",
							"Hoenshell, Eulalia",
							"Isaman, Lalo",
							"James, Diamond",
							"Jenkins, Merrill",
							"Jube, Bennett",
							"Kava, Marianne",
							"Kern, Linda",
							"Klockman, Jenifer",
							"Lacon, Quincy",
							"Laurenzi, Leland",
							"Leichter, Jeane",
							"Leslie, Kerrie",
							"Lester, Noah",
							"Llora, Roxana",
							"Lombardi, Polly",
							"Lowstetter, Louisa",
							"Mays, Emery",
							"Mccullough, Bernadine",
							"Mckinnon, Kristie",
							"Meyers, Hector",
							"Monahan, Penelope",
							"Mull, Kaelea",
							"Newbiggin, Osmond",
							"Nickolson, Alfreda",
							"Pawle, Jacki",
							"Paynter, Nerissa",
							"Pinney, Wilkie",
							"Pratt, Ricky",
							"Putnam, Stephanie",
							"Ream, Terrence",
							"Rumbaugh, Noelle",
							"Ryals, Titania",
							"Saylor, Lenora",
							"Schofield, Denice",
							"Schuck, John",
							"Scott, Clover",
							"Smith, Estella",
							"Smothers, Matthew",
							"Stainforth, Maurene",
							"Stephenson, Phillipa",
							"Stewart, Hyram",
							"Stough, Gussie",
							"Strickland, Temple",
							"Sullivan, Gertie",
							"Swink, Stefanie",
							"Tavoularis, Terance",
							"Taylor, Kizzy",
							"Thigpen, Alwyn",
							"Treeby, Jim",
							"Trevithick, Jayme",
							"Waldron, Ashley",
							"Wheeler, Bysshe",
							"Whishaw, Dodie",
							"Whitehead, Jericho",
							"Wilks, Debby",
							"Wire, Tallulah",
							"Woodworth, Alexandria",
							"Zaun, Jillie"}; 

		 String [] info = {"Bedfordshire",
							"Buckinghamshire",
							"Cambridgeshire",
							"Cheshire",
							"Cornwall",
							"Cumbria",
							"Derbyshire",
							"Devon", 
							"Dorset", 
							"Durham", 
							"East Sussex",
							"Essex",
							"Gloucestershire",
							"Hampshire",
							"Hertfordshire", 
							"Kent", 
							"Lancashire",
							"Leicestershire",
							"Lincolnshire",
							"Norfolk",
							"Northamptonshire",
							"Northumberland", 
							"North Yorkshire", 
							"Nottinghamshire",
							"Oxfordshire",
							"Shropshire",
							"Somerset",
							"Staffordshire",
							"Suffolk", 
							"Surrey",
							"Warwickshire",
							"West Sussex",
							"Wiltshire",
							"Worcestershire", 
							"Durham", 
							"East Sussex",
							"Essex",
							"Gloucestershire",
							"Hampshire",
							"Hertfordshire", 
							"Kent", 
							"Lancashire",
							"Leicestershire",
							"Lincolnshire",
							"Norfolk",
							"Northamptonshire",
							"Northumberland", 
							"North Yorkshire", 
							"Nottinghamshire",
							"Oxfordshire",
							"Shropshire",
							"Somerset",
							"Staffordshire",
							"Suffolk", 
							"Surrey",
							"Warwickshire",
							"West Sussex",
							"Wiltshire",
							"Worcestershire", 
							"Durham", 
							"East Sussex",
							"Essex",
							"Gloucestershire",
							"Hampshire",
							"Hertfordshire", 
							"Kent", 
							"Lancashire",
							"Leicestershire",
							"Lincolnshire",
							"Norfolk",
							"Northamptonshire",
							"Northumberland", 
							"North Yorkshire", 
							"Nottinghamshire",
							"Oxfordshire",
							"Shropshire",
							"Somerset",
							"Staffordshire",
							"Suffolk", 
							"Surrey",
							"Warwickshire",
							"West Sussex",
							"Wiltshire",
							"Worcestershire", 
							"Durham", 
							"East Sussex",
							"Essex",
							"Gloucestershire",
							"Hampshire",
							"Hertfordshire", 
							"Kent", 
							"Lancashire",
							"Leicestershire",
							"Lincolnshire",
							"Norfolk",
							"Northamptonshire",
							"Northumberland", 
							"North Yorkshire", 
							"Nottinghamshire"}; 


		   String searchTerm = request.getParameter("input");
		   //String searchTerm = term.toLowerCase();
		   String limit = request.getParameter("limit");
		   System.out.println(searchTerm);
		   System.out.println(limit);
		   
		   if((limit != null) || (!limit.equals(""))){
		   	
			   numLimit = Integer.parseInt(limit);
		   }	 
		 
		 
		   if (searchTerm.length() > j) {
		
			   for(int i = 0; i < names.length; i++) {
		   
				   if (names[i].startsWith(searchTerm)){
		                
		            	results.add(names[i]);
		                j = j++;
		            
		            }
			   }
		 
		    	StringBuilder resultDoc = new StringBuilder("<?xml version=\'1.0\' encoding=\'utf-8\' ?><results>");
		    	Iterator iterator = results.iterator();
		    	int k = 0;
			
		    	while (iterator.hasNext()){		
		    		
		    		resultDoc.append("<rs id=\"" + k++ + "\" info=\"\"> " + (String)iterator.next() + "</rs>");
			
		    	}
			
		    	resultDoc.append("</results>");
		    	response.setContentType("text/xml");
		        
		        
		        PrintWriter out = response.getWriter();
		        out.println(resultDoc);
		        
		   }
		    
	} 

    
    /** 
    * Returns a short description of the servlet.
    */
    public String getServletInfo() {
        return "Short description";
    }
    // </editor-fold>

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
