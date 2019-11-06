package ratMaze;

public class Maze {

	int [][] sol;
	public void disp(int[][] maze)
	{
		sol=new int[maze.length][maze.length];
		for(int i=0;i<maze.length;i++)
		{
			for(int j=0;j<maze.length;j++)
			{
				sol[i][j]=0;
			}
		}
		int x=0;
		int y=0;
		findpath(maze, x, y, sol);
	}
	private boolean isOk(int[][] maze, int x, int y) {
		if(x>=0&&x<maze.length &&y>=0 &&y<maze.length && maze[x][y]==1)
		{
			return true;
		}
		return false;
	}
	
	public boolean findpath(int [][] maze,int x,int y,int sol[][])
	{
		
		if(isOk(maze,x,y))
		{
			sol[x][y]=1;
			
		    if(x==maze.length-1 && y==maze.length-1)
		    {
		    	return true;
		    }
		    if(findpath(maze, x, y+1, sol))
				
		    {
		    	return true;
		    }
		    if(findpath(maze, x+1, y, sol))
		    {
		    	return true;
		    }
		    
		    
		    else
		    {
		    	sol[x][y]=0;
		    	return false;
		    }
		}
		return false;
		
		
		
	}
	
	
	public void printSol()
	{
		for(int i=0;i<sol.length;i++)
		{
			for(int j=0;j<sol.length;j++)
			{
				System.out.print(" "+sol[i][j]+" ");
				
			}
			System.out.println();
		}
	}
	
	
	
}
