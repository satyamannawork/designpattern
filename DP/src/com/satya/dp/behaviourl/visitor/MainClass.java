package com.satya.dp.behaviourl.visitor;

interface  Repository
{
	public void chechOut(RepositoryVisitor visitor);
}

class  SVN  implements  Repository  {
	SVN(){
	System.out.println("SVN Repository Called");
	}
	@Override
	public void chechOut(RepositoryVisitor visitor){
		System.out.println("Checking out from  SVN");
		visitor.checkOut(this);
	}

}

class  GIT  implements  Repository  {
	GIT(){
	System.out.println("GIT Repository Called");
	}
	@Override
	public void chechOut(RepositoryVisitor visitor){
		System.out.println("Checking out from  GIT");
		visitor.checkOut(this);
	}

}

interface RepositoryVisitor{
	public void checkOut(Object object);
}

class RepositoryVisitorImpl  implements   RepositoryVisitor{
 
 @Override
 public void checkOut(Object object){
 	if(null!=object &&  object instanceof  SVN){
 		System.out.println("Some specific  command  is being excuting for svn");
 	}
 	if(null!=object &&  object instanceof  GIT){
 		System.out.println("Some specific  command  is being excuting for GIT");
 	}
 }


}

class MainClass{
	public static void main(String argv[]){
		
		Repository[] repositoryies =  {new SVN(),  new GIT()} ; 
		RepositoryVisitor  repositoryVisitor =  new  RepositoryVisitorImpl();
		for(Repository repository : repositoryies ) { 
			repositoryVisitor.checkOut(repository);
		}

	}
}
