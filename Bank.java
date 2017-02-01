import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class bk implements ActionListener
{
	JFrame jf=new JFrame("Banking");
	JFrame jbf=new JFrame("Banking");
	JButton jb,jb1,jb3,jb4,jb5,jc,jbb,jrb,jj,jjb,jjb1,jjb2,jjb3,jjb4,jsb,jlb,jlb1,jblb,jlb2;
	JFrame jf1=new JFrame("Log In");
	JFrame jf2=new JFrame("Register");
	int x=0;
	JLabel accl4;
	gt g;	gt1 g1;	 gt2 g2;	gt3 g3;	gt4 g4;
	Connection c=null;Statement s=null;
	String un=null;
	CardLayout cl;
	JTextField jst,jst1,jst2,jtf,jtf1,jtf2,jtf3,jtf4,jtf5,jlbt,jlbt1;
	JPasswordField jpf=new JPasswordField(20);
	JPasswordField jpf1=new JPasswordField(20);
	JPasswordField jltf,jltf1,jltf2;
	JPanel jbp,jbp1,jbp2,jbp3;
	static final String DB_URL="jdbc:mysql://localhost:3306/banking";
	bk()
	{
		
		jf2.setVisible(false);
		jf1.setVisible(false);
		JLabel jl,j,j1,jl1,jl2;
		JPanel jp,jp1,jp2;
		jf.setVisible(true);
		jf.setSize(500,700);
		g=new gt();
		g.setPreferredSize(new Dimension(500,100));
		Font f=new Font("",Font.BOLD,20);
		g.setFont(f);
		g.setBackground(Color.BLACK);
		g.setForeground(Color.GREEN);
		jf.add(g,BorderLayout.NORTH);
		j=new JLabel(new ImageIcon("sbi.jpg"));
		jf.add(j,BorderLayout.CENTER);
		jp2=new JPanel();
		jp2.setLayout(null);
		jp2.setBackground(Color.BLACK);
		jp2.setPreferredSize(new Dimension(500,100));
		jl1=new JLabel("Chal Kar Aaiye Aur Chala Kar Le Jaiye");
		jl1.setFont(new Font("",Font.BOLD,22));
		jl1.setForeground(Color.GREEN);
		jl1.setBounds(130,10,400,50);
		jp2.add(jl1);
		jl2=new JLabel(" SBI Car Loan");
		jl2.setFont(new Font("",Font.BOLD,22));
		jl2.setForeground(Color.GREEN);
		jl2.setBounds(260,40,300,50);
		jp2.add(jl2);
		jf.add(jp2,BorderLayout.SOUTH);
		jf.pack();
		jf.setLocationRelativeTo(null);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void login()
	{
		JLabel jl,jl1,jl2,jl3,jl4,j,j1;
		jf.setVisible(false);
		jf1.setSize(500,700);
		JPanel jp=new JPanel();
		j=new JLabel(new ImageIcon("nri.jpg"));
		jp.add(j);
		jp.setPreferredSize(new Dimension(500,135));
		jf1.add(jp,BorderLayout.NORTH);
		jl2=new JLabel(new ImageIcon("sb.jpg"));
		jl3=new JLabel("User Name");
		jl3.setForeground(Color.GREEN);
		jl3.setBounds(10,170,80,30);
		jf1.add(jl3);
		jtf=new JTextField(10);
		jtf.setText(" ");
		jtf.setBounds(95,173,80,20);
		jf1.add(jtf);
		jl4=new JLabel("Password");
		jl4.setForeground(Color.GREEN);
		jl4.setBounds(10,220,80,30);
		jf1.add(jl4);
		jpf1.setEchoChar('*');
		jpf1.setBounds(95,220,80,20);
		jf1.add(jpf1);
		jbb=new JButton("Back");
		jbb.setBackground(Color.BLACK);
		jbb.setForeground(Color.GREEN);
		jbb.setBounds(25,270,70,30);
		jf1.add(jbb);
		jbb.addActionListener(this);
		jb3=new JButton("Log In");
		jb3.setBackground(Color.BLACK);
		jb3.setForeground(Color.GREEN);
		jb3.setBounds(100,270,70,30);
		jf1.add(jb3);
		jb3.addActionListener(this);
		jf1.add(jl2,BorderLayout.CENTER);
		JPanel jp1=new JPanel();
		j1=new JLabel(new ImageIcon("hl.jpg"));
		jp1.add(j1);
		jp1.setPreferredSize(new Dimension(500,170));
		jf1.add(jp1,BorderLayout.SOUTH);
		jf1.setVisible(true);
		jf1.setLocationRelativeTo(null);
		jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void register()
	{
		jf.setVisible(false);		
		jf2.setSize(600,700);
		JPanel jrp=new JPanel();
		JLabel jrl=new JLabel(new ImageIcon("nri.jpg"));
		jrp.setPreferredSize(new Dimension(600,131));
		jrp.add(jrl);
		jf2.add(jrp,BorderLayout.NORTH);
		JLabel jl,jl2,jl3,jl4,jl5,jl6,jl7,jl8,jl9,jl0;
		jl=new JLabel(new ImageIcon("c1.png"));
		jl2=new JLabel("Account No.");
		jl2.setForeground(Color.BLACK);
		jl2.setBounds(175,160,125,30);
		jf2.add(jl2);
		jtf=new JTextField(20);
		jtf.setText(" ");
		jtf.setBounds(290,160,125,20);
		jf2.add(jtf);
		jc=new JButton("Check");
		jc.setBackground(Color.BLACK);
		jc.setForeground(Color.WHITE);
		jc.setBounds(435,157,75,22);
		jc.addActionListener(this);
		jf2.add(jc);
		jl3=new JLabel("CIF Number.");
		jl3.setForeground(Color.BLACK);
		jl3.setBounds(175,200,125,30);
		jf2.add(jl3);
		jl9=new JLabel("( Ex: SBI0123 )");
		jl9.setForeground(Color.BLACK);
		jl9.setBounds(430,195,125,30);
		jf2.add(jl9);
		jtf1=new JTextField(20);
		jtf1.setText(" ");
		jtf1.setBounds(290,200,125,20);
		jtf1.setEditable(false);
		jf2.add(jtf1);
		jl4=new JLabel("Branch Code ");
		jl4.setForeground(Color.BLACK);
		jl4.setBounds(175,240,125,30);
		jf2.add(jl4);
		jl0=new JLabel("( Enter 6 Digit No )");
		jl0.setForeground(Color.BLACK);
		jl0.setBounds(430,235,150,30);
		jf2.add(jl0);
		jtf2=new JTextField(20);
		jtf2.setText(" ");
		jtf2.setBounds(290,240,125,20);
		jtf2.setEditable(false);
		jf2.add(jtf2);
		jl5=new JLabel("Mobile Number.");
		jl5.setForeground(Color.BLACK);
		jl5.setBounds(175,280,125,30);
		jf2.add(jl5);
		jtf3=new JTextField(20);
		jtf3.setText(" ");
		jtf3.setBounds(290,280,125,20);
		jtf3.setEditable(false);
		jf2.add(jtf3);
		jl6=new JLabel("Facility Required.");
		jl6.setForeground(Color.BLACK);
		jl6.setBounds(175,320,125,30);
		jf2.add(jl6);
		String s[]={"--Select Transaction Right--","Full Transaction Right","Limited Transaction Right"};
		JComboBox jcmb=new JComboBox(s);
		jcmb.setBounds(290,320,185,25);
		jf2.add(jcmb);
		jl7=new JLabel("Enter Username");
		jl7.setForeground(Color.BLACK);
		jl7.setBounds(30,365,120,30);
		jf2.add(jl7);
		jtf4=new JTextField(10);
		jtf4.setText(" ");
		jtf4.setBounds(140,370,120,20);
		jtf4.setEditable(false);
		jf2.add(jtf4);
		jl8=new JLabel("Password");
		jl8.setForeground(Color.BLACK);
		jl8.setBounds(285,365,120,30);
		jf2.add(jl8);
		jpf.setEchoChar('*');
		jpf.setEditable(false);
        jpf.addActionListener(this);
		jpf.setBounds(365,370,120,20);
		jf2.add(jpf);
		jrb=new JButton("Back");
		jrb.setBackground(Color.BLACK);
		jrb.setForeground(Color.WHITE);
		jrb.setBounds(220,410,80,30);
		jf2.add(jrb);
		jrb.addActionListener(this);
		jb4=new JButton("Register");
		jb4.addActionListener(this);
		jb4.setBackground(Color.BLACK);
		jb4.setForeground(Color.WHITE);
		jb4.setEnabled(false);
		jb4.setBounds(310,410,90,30);
		jf2.add(jb4);
		jf2.add(jl,BorderLayout.CENTER);
		JPanel jrp1=new JPanel();
		JLabel jrl1=new JLabel(new ImageIcon("hl.jpg"));
		jrp1.setPreferredSize(new Dimension(600,170));
		jrp1.add(jrl1);
		jf2.add(jrp1,BorderLayout.SOUTH);
		jf2.setLocationRelativeTo(null);
		jf2.setVisible(true);
		jf2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void body()
	{
		jf.setVisible(false);
		jf1.setVisible(false);
		jf2.setVisible(false);
		jbf.setSize(500,700);
		jbp1=new JPanel();
		jbp1.setLayout(null);
		jbp1.setBackground(Color.BLACK);
		jbp1.setPreferredSize(new Dimension(500,200));
		JLabel jbb2=new JLabel("Welcome To SBI Net Banking");
		jbb2.setForeground(Color.YELLOW);
		jbb2.setFont(new Font("",Font.PLAIN,15));
		jbb2.setBounds(150,5,200,60);
		JLabel jbb1=new JLabel(un);
		jbb1.setFont(new Font("",Font.PLAIN,15));
		jbb1.setForeground(Color.YELLOW);
		jbb1.setBounds(230,30,80,60);
		jbp1.add(jbb1);
		jbp1.add(jbb2);
		jj=new JButton("Home");
		jj.setBackground(Color.BLACK);
		jj.setForeground(Color.YELLOW);
		jj.setBounds(10,10,80,30);
		jj.addActionListener(this);
		jbp1.add(jj);
		jjb=new JButton("Log Out");
		jjb.setBackground(Color.BLACK);
		jjb.setForeground(Color.YELLOW);
		jjb.setBounds(400,10,80,30);
		jjb.addActionListener(this);
		jbp1.add(jjb);
		jjb1=new JButton("Account Statement");
		jjb1.setBackground(Color.BLACK);
		jjb1.setForeground(Color.YELLOW);
		jjb1.setBounds(75,80,180,30);
		jjb1.addActionListener(this);
		jbp1.add(jjb1);
		jjb2=new JButton("Fund Transfer");
		jjb2.setBackground(Color.BLACK);
		jjb2.setForeground(Color.YELLOW);
		jjb2.setBounds(260,80,180,30);
		jjb2.addActionListener(this);
		jbp1.add(jjb2);
		jjb3=new JButton("Set Transaction Limit");
		jjb3.setBackground(Color.BLACK);
		jjb3.setForeground(Color.YELLOW);
		jjb3.setBounds(75,140,180,30);
		jjb3.addActionListener(this);
		jbp1.add(jjb3);
		jjb4=new JButton("Change Login Password");
		jjb4.setBackground(Color.BLACK);
		jjb4.setForeground(Color.YELLOW);
		jjb4.setBounds(260,140,180,30);
		jjb4.addActionListener(this);
		jbp1.add(jjb4);
		jbf.add(jbp1,BorderLayout.NORTH);
		jbp2=new JPanel();
		cl=new CardLayout();
		jbp2.setLayout(cl);
		jbp3=new JPanel();
		jbp3.add(new JLabel(new ImageIcon("sl.jpg")));
		g1=new gt1();	g2=new gt2();	g3=new gt3();	g4=new gt4();
		g1.fetch();
		jbp2.add(jbp3,"Front");
		jbp2.add(g1,"Statement");
		jbp2.add(g2,"Transfer");
		jbp2.add(g3,"Change");
		jbp2.add(g4,"Set");
		jbf.add(jbp2);
		jbp=new JPanel();
		jbp.setLayout(null);
		jbp.setPreferredSize(new Dimension(600,130));
		JLabel jls=new JLabel("Protect Your Family's Health with");
		jls.setFont(new Font("",Font.BOLD,15));
		jls.setForeground(Color.YELLOW);
		jls.setBounds(130,10,250,30);
		jbp.add(jls);
		JLabel jls1=new JLabel("SBI LIFE");
		jls1.setFont(new Font("",Font.BOLD,15));
		jls1.setForeground(Color.YELLOW);
		jls1.setBounds(200,40,120,30);
		jbp.add(jls1);
		JLabel jls2=new JLabel("Health Insurance Plan");
		jls2.setFont(new Font("",Font.BOLD,15));
		jls2.setForeground(Color.YELLOW);
		jls2.setBounds(160,70,200,30);
		jbp.add(jls2);
		jbp.setBackground(Color.BLACK);
		jbf.add(jbp,BorderLayout.SOUTH);
		jbf.setLocationRelativeTo(null);
		jbf.setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==jj)
		{	cl.show(jbp2,"Front");	}
		else
		if(ae.getSource()==jbb)
		{	new bk();	jf1.setVisible(false);		}
		else
		if(ae.getSource()==jrb)
		{	jf2.setVisible(false);		new bk();	}
		else
		if(ae.getSource()==jb3)
		{
			char cg[]=jpf1.getPassword();
			String s1=new String(cg);
			String s2=jtf.getText();
			System.out.println(s2+"\t"+s1);
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				c=DriverManager.getConnection(DB_URL,"root","11403008");
				s=c.createStatement();
				System.out.println("Cart Crated");
				ResultSet rsl=s.executeQuery("select *from login");	
				boolean bl=false;
				
				int  ou=0;
				while(rsl.next())
				{ ou++;}
				rsl.beforeFirst();
				String []usnme=new String[ou];
				String []psrd=new String[ou];
				int ot=0;
				while(rsl.next())
				{
					usnme[ot]=rsl.getString("usrname");
					psrd[ot]=rsl.getString("psw");
					ot++;
				}
				for(int i=0;i<ou;i++)
				{
					if(s2.equals(usnme[i]) && s1.equals(psrd[i]))
					{		bl=true;
						un=usnme[i];	body();
						break;
					}
					else
					{	bl=false;	}
				}
				
				if(bl==false)
				{	JOptionPane.showMessageDialog(null,"Enter valid username and password");	}
			}
			catch(Exception e)
			{	System.out.println(e);	}
		}
		else
		if(ae.getSource()==jb4)
		{
			char cg[]=jpf.getPassword();
        	String s1=new String(cg);
        	String s2=jtf4.getText();
			String s3=jtf.getText();
			String s4=jtf1.getText();
			String s5=jtf2.getText();
			String s6=jtf3.getText();
			int k=0;
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				c=DriverManager.getConnection(DB_URL,"root","11403008");
				s=c.createStatement();
				if(s3.equals("") || s4.equals("") || s5.equals("") || s6.equals("") || s2.equals("") || s1.equals(""))
				{	JOptionPane.showMessageDialog(null,"Please enter the empty field");		}
				else
				{
					boolean bs=false;
					boolean bss=false;
					ResultSet rs=s.executeQuery("select *From login");
					while(rs.next())
					{	k++;	}
					rs.beforeFirst();
					String sr=jtf.getText();
					int l1=Integer.parseInt(sr.trim());
					int []l2=new int[k];
					int p=0;
					while(rs.next())
					{
						l2[p]=rs.getInt("acc_no");
						p++;
					}
					for(int j=0;j<k;j++)
					{
						if(l2[j]==l1)
						{
							bs=true;
							JOptionPane.showMessageDialog(null,"Account is Already Register");
							break;
						}
					}
					String r1=jtf4.getText();
					String []sr2=new String[k];
					if(bs==false)
					{
						int q=0;
						rs.beforeFirst();
						while(rs.next())
						{
							sr2[q]=rs.getString("usrname");
							q++;
						}
						for(int y=0;y<k;y++)
						{
							if(sr2[y].equals(r1))
							{	bss=true;
								JOptionPane.showMessageDialog(null,"Username Already Taken");
								break;
							}
						}
						if(bss==false)
						{
							JOptionPane.showMessageDialog(null,"Thank you for Registering");
							String persnl="insert into personal_detail(acc_no,cif_no,br_code,mob_no)values('"+s3+"','"+s4+"','"+s5+"','"+s6+"')";
							s.executeUpdate(persnl);
							String log="insert into login(usrname,psw,acc_no)values('"+s2+"','"+s1+"','"+s3+"')";
							s.executeUpdate(log);
							System.out.println("Sucessfully Updated");
							new bk();
							jf2.setVisible(false);
						}	
					}
					
				}
			}
			catch(Exception e)
			{	System.out.println(e);	}
		}
		else
		if(ae.getSource()==jc)
		{
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				c=DriverManager.getConnection(DB_URL,"root","11403008");
				s=c.createStatement();
				ResultSet rc=s.executeQuery("select acc_no from customer");
				boolean bc=false;
				String sc=jtf.getText();
				int l=Integer.parseInt(sc.trim());
				int count=0;
				while(rc.next())
				{	count++;	}
				int ac[]=new int[count];
				rc.beforeFirst();
				int i=0;
				while(rc.next())
				{
					ac[i]=rc.getInt("acc_no");
					i++;
				}
				for(int j=0;j<count;j++)
				{
					if(ac[j]==l)
					{
						bc=true;
						jtf1.setEditable(true);
						jtf2.setEditable(true);
						jtf3.setEditable(true);
						jtf4.setEditable(true);
						jtf2.setEditable(true);
						jpf.setEditable(true);
						jb4.setEnabled(true);
						break;
					}
					else
					{	bc=false;	}
				}
				if(bc==false)
				{	JOptionPane.showMessageDialog(null,"Account No. Does Not Exist");	}
					rc.close();	
				}
			catch(Exception e)
			{	System.out.println(e);	}
		}
		else 
		if(ae.getSource()==jjb)
		{	JOptionPane.showMessageDialog(null,"Thank You For Using Net Banking");
			new bk();	jbf.setVisible(false);
		}
		else
		if(ae.getSource()==jjb1)
		{	g1=new gt1();
			g1.fetch();
			cl.show(jbp2,"Statement");	}
		else
		if(ae.getSource()==jjb2)
		{	cl.show(jbp2,"Transfer");	}
		else
		if(ae.getSource()==jjb3)
		{	cl.show(jbp2,"Set");	}
		else
		if(ae.getSource()==jjb4)
		{	cl.show(jbp2,"Change");	}
	}
	public class gt4 extends JPanel implements ActionListener
	{
		gt4()
		{
			setLayout(null);
			setBackground(Color.GREEN);
			JLabel jtlb=new JLabel("Set Limit");
			jtlb.setFont(new Font("",Font.BOLD,25));
			jtlb.setBounds(180,20,120,20);
			jtlb.setForeground(Color.BLACK);
			add(jtlb);
			JLabel jtlb1=new JLabel("No. of per day Transaction");
			jtlb1.setBounds(80,80,180,30);
			jtlb1.setForeground(Color.BLACK);
			add(jtlb1);
			jlbt=new JTextField(10);
			jlbt.setBounds(270,85,120,20);
			add(jlbt);
			JLabel jtlb2=new JLabel("Amount per Transaction");
			jtlb2.setBounds(80,140,180,30);
			jtlb2.setForeground(Color.BLACK);
			add(jtlb2);
			jlbt1=new JTextField(10);
			jlbt1.setBounds(270,145,120,20);
			add(jlbt1);
			jblb=new JButton("Submit");
			jblb.addActionListener(this);
			jblb.setBackground(Color.BLACK);
			jblb.setForeground(Color.GREEN);
			jblb.setBounds(210,200,100,30);
			add(jblb);
		}
		public void actionPerformed(ActionEvent ae)
		{
			String ssr=jlbt.getText();
			String ssr1=jlbt1.getText();
			if(ae.getSource()==jblb)
			{	
				if(ssr.equals("") || ssr1.equals(""))
				{	JOptionPane.showMessageDialog(null,"Enter Empty Field");	}
				else
				{
					JOptionPane.showMessageDialog(null,"Successfully Uploaded");
					jlbt.setText("");	jlbt1.setText("");
				}
			}
		}
	}
	public class gt3 extends JPanel implements ActionListener
	{
		gt3()
		{
			setBackground(Color.YELLOW);
			setLayout(null);
			JLabel jlt=new JLabel("Change Password");
			jlt.setFont(new Font("",Font.PLAIN,22));
			jlt.setForeground(Color.BLACK);
			jlt.setBounds(150,20,180,20);
			add(jlt);
			JLabel jlt1=new JLabel("Old Password");
			jlt1.setBounds(130,90,100,20);
			jlt1.setForeground(Color.BLACK);
			add(jlt1);
			jlb1=new JButton("Match");
			jlb1.setBackground(Color.BLACK);
			jlb1.setForeground(Color.YELLOW);
			jlb1.setBounds(365,90,100,22);
			jlb1.addActionListener(this);
			add(jlb1);
			jltf=new JPasswordField(10);
			jltf.setEchoChar('*');
			jltf.setBounds(250,90,100,20);
			add(jltf);
			JLabel jlt2=new JLabel("New Password");
			jlt2.setBounds(130,130,100,20);
			jlt2.setForeground(Color.BLACK);
			add(jlt2);
			jltf1=new JPasswordField(10);
			jltf1.setEchoChar('*');
			jltf1.setBounds(250,130,100,20);
			jltf1.setEditable(false);
			add(jltf1);
			JLabel jlt3=new JLabel("Retype Password");
			jlt3.setBounds(130,170,100,20);
			jlt3.setForeground(Color.BLACK);
			add(jlt3);
			jltf2=new JPasswordField(10);
			jltf2.setEchoChar('*');
			jltf2.setBounds(250,170,100,20);
			jltf2.setEditable(false);
			add(jltf2);
			jlb2=new JButton("Confirm");
			jlb2.setBackground(Color.BLACK);
			jlb2.setForeground(Color.YELLOW);
			jlb2.setBounds(365,170,100,22);
			jlb2.addActionListener(this);
			jlb2.setEnabled(false);
			add(jlb2);
			jlb=new JButton("Submit");
			jlb.setBackground(Color.BLACK);
			jlb.setForeground(Color.YELLOW);
			jlb.setBounds(215,220,100,30);
			jlb.setEnabled(false);
			jlb.addActionListener(this);
			add(jlb);
		}
		public void actionPerformed(ActionEvent ae)
		{
			String sbr=jltf.getText();
			String sbr1=null;
			if(ae.getSource()==jlb1)
			{
				try
				{
					Class.forName("com.mysql.jdbc.Driver");
					c=DriverManager.getConnection(DB_URL,"root","11403008");
					s=c.createStatement();
					ResultSet rf=s.executeQuery("select psw from login where usrname"+"='"+un+"'");
					while(rf.next())
					{	sbr1=rf.getString(1);	}
					if(sbr.equals(sbr1))
					{
						jltf1.setEditable(true);
						jltf2.setEditable(true);
						jlb2.setEnabled(true);
					}
					else
					{	JOptionPane.showMessageDialog(null,"Wrong Password");	}		
				}
				catch(Exception e)
				{	System.out.println(e);	}
			}
			else
			if(ae.getSource()==jlb2)
			{
				char ch[]=jltf1.getPassword();
        		String slb=new String(ch);
				char ch1[]=jltf2.getPassword();
				String slb1=new String(ch1);
				if(slb.equals(slb1))
				{	jlb.setEnabled(true);	}
				else
				{	JOptionPane.showMessageDialog(null,"Password Does not Match");		}
			}
			else
			if(ae.getSource()==jlb)
			{
				char ch[]=jltf1.getPassword();
        		String slb=new String(ch);
				try
				{
					Class.forName("com.mysql.jdbc.Driver");
					c=DriverManager.getConnection(DB_URL,"root","11403008");
					s=c.createStatement();
					PreparedStatement ps2=c.prepareStatement("update login set psw=? where usrname=?");
					ps2.setString(1,slb);		ps2.setString(2,un);
					ps2.executeUpdate();
					System.out.println("Successfully updated");
					jltf.setText("");
					jltf2.setEchoChar(' ');
					jltf1.setEchoChar(' ');
				}	
				catch(Exception e)
				{	System.out.println(e);		}
			}
		}
	}
	public class gt2 extends JPanel implements ActionListener
	{
		gt2()
		{
			setBackground(Color.GREEN);
			setLayout(null);
			JLabel jft=new JLabel("Fund Transfer");
			Font f1=new Font("",Font.BOLD,22);
			jft.setFont(f1);
			jft.setForeground(Color.BLACK);
			jft.setBounds(180,30,150,40);
			add(jft);		
			JLabel jft1=new JLabel("To");
			jft1.setForeground(Color.BLACK);
			jft1.setBounds(180,90,50,20);
			add(jft1);		
			jst=new JTextField(10);
			jst.setForeground(Color.BLACK);
			jst.setBounds(230,90,120,20);
			add(jst);
			jc=new JButton("Check");
			jc.setBackground(Color.BLACK);
			jc.setForeground(Color.YELLOW);
			jc.setBounds(370,90,80,20);
			add(jc);
			jc.addActionListener(this);
			JLabel jft2=new JLabel("Amount");
			jft2.setBounds(160,130,80,20);
			jft2.setForeground(Color.BLACK);
			add(jft2);
			jst1=new JTextField(10);
			jst1.setEditable(false);
			jst1.setBounds(230,130,120,20);
			add(jst1);
			JLabel jft3=new JLabel("Mobile No.");
			jft3.setBounds(160,170,100,20);
			jft3.setBackground(Color.BLACK);
			add(jft3);
			jst2=new JTextField(10);
			jst2.setBounds(230,170,120,20);
			jst2.setEditable(false);
			add(jst2);
			jsb=new JButton("Submit");
			jsb.setBackground(Color.BLACK);
			jsb.setForeground(Color.GREEN);
			jsb.setBounds(230,230,80,30);
			jsb.addActionListener(this);
			jsb.setEnabled(false);
			add(jsb);
		}
		public void actionPerformed(ActionEvent ae)
		{
			if(ae.getSource()==jc)
			{
				try
				{
					Class.forName("com.mysql.jdbc.Driver");
					c=DriverManager.getConnection(DB_URL,"root","11403008");
					s=c.createStatement();
					ResultSet rc=s.executeQuery("select acc_no from customer");
					boolean bc=false;
					String sc=jst.getText();
					int l=Integer.parseInt(sc.trim());
					System.out.println(l);
					int count=0;
					while(rc.next())
					{	count++;	}
					int ac[]=new int[count];
					rc.beforeFirst();
					int i=0;
					while(rc.next())
					{	ac[i]=rc.getInt("acc_no");		i++;	}
					for(int j=0;j<count;j++)
					{
						if(ac[j]==l)
						{	bc=true;
							jst1.setEditable(true);
							jst2.setEditable(true);
							jsb.setEnabled(true);
							break;		}
						else
						{	bc=false;	}
					}
					if(bc==false)
					{	JOptionPane.showMessageDialog(null,"Account No. Does Not Exist");	}
					rc.close();
				}	
				catch(Exception e)
				{	System.out.println(e);	}
			}
			else
			if(ae.getSource()==jsb)
			{
				String ssb2=jst.getText();
				String ssb=jst1.getText();
				String ssb3=jst2.getText();
				int o=Integer.parseInt(ssb2.trim());
				String ssb1=null;
				int am=0;
				try
				{
					Class.forName("com.mysql.jdbc.Driver");
					c=DriverManager.getConnection(DB_URL,"root","11403008");
					s=c.createStatement();
					if(ssb.equals("") || ssb3.equals(""))
					{
						JOptionPane.showMessageDialog(null,"Enter Empty Fiels");
						jst1.setEditable(false);
						jst2.setEditable(false);
					}
					else
					{	
					int sbs=Integer.parseInt(ssb);	ResultSet rc=s.executeQuery("select acc_no from login where usrname"+"='"+un+"'");
						while(rc.next())
					{	ssb1=rc.getString(1);	}
						ResultSet rc1=s.executeQuery("select amount from customer where acc_no"+"='"+ssb1+"'");
						while(rc1.next())
						{	am=rc1.getInt(1);	}
						if(am<sbs)
						{	JOptionPane.showMessageDialog(null,"Insufficient Amount");		}							
						else
						{
							System.out.println(ssb1);
							PreparedStatement ps=c.prepareStatement("update customer set amount=amount-? where acc_no=?");
							ps.setString(1,ssb);ps.setString(2,ssb1);
							ps.executeUpdate();
							PreparedStatement ps1=c.prepareStatement("update customer set amount=amount+? where acc_no=?");
							ps1.setString(1,ssb);ps1.setInt(2,o);	
							ps1.executeUpdate();
							System.out.println("Successfully updated");
							jst1.setText("");
							jst.setText("");
							jst2.setText("");
						}
					}
						
				}
				catch(Exception e)
				{	System.out.println(e);		}
			}
		}
	}
	public class gt1 extends JPanel
	{
		String sacc,sacc1,sacc2;
		gt1()
		{
			System.out.println("fetching");
			fetch();
			setLayout(null);
			setBackground(Color.YELLOW);
			JLabel accl1=new JLabel("Account No.");
			accl1.setBounds(150,100,80,20);
			accl1.setForeground(Color.BLACK);
			add(accl1);
			JLabel accl2=new JLabel(sacc);
			accl2.setBounds(250,100,80,20);
			accl2.setForeground(Color.BLACK);
			add(accl2);
			JLabel accl5=new JLabel("Name");
			accl5.setBounds(150,150,80,20);
			accl5.setForeground(Color.BLACK);
			add(accl5);
			JLabel accl3=new JLabel(sacc1);
			accl3.setBounds(250,150,80,20);
			accl3.setForeground(Color.BLACK);
			add(accl3);
			JLabel accl6=new JLabel("Amount");
			accl6.setBounds(150,200,80,20);
			accl6.setForeground(Color.BLACK);
			add(accl6);
			 accl4=new JLabel(sacc2);
			accl4.setBounds(250,200,80,20);
			accl4.setForeground(Color.BLACK);
			add(accl4);
			accl4.revalidate();
			
		}
		void fetch()
		{
			try
			{
				
				Class.forName("com.mysql.jdbc.Driver");
				c=DriverManager.getConnection(DB_URL,"root","11403008");
				s=c.createStatement();
				ResultSet rc=s.executeQuery("select acc_no from login where usrname"+"='"+un+"'");
				while(rc.next())
				{	sacc=rc.getString(1);	}
				ResultSet rc1=s.executeQuery("select name,amount from customer where acc_no"+"='"+sacc+"'");
				while(rc1.next())
				{		sacc1=rc1.getString(1);			sacc2=rc1.getString(2);	
					}
					System.out.println(sacc2);
				accl4.setText(sacc2);			
			}
			catch(Exception e)
			{	System.out.println(e);	}
		}
	}
	public class gt extends JPanel implements ActionListener
	{
		gt()
		{
			jb=new JButton("Log In");
			jb.setBackground(Color.BLACK);
			jb.setForeground(Color.GREEN);
			setLayout(null);
			jb.setBounds(240,50,75,30);
			jb1=new JButton("Register");
			jb1.setBackground(Color.BLACK);
			jb1.setForeground(Color.GREEN);
			jb1.setBounds(330,50,90,30);
			add(jb);	
			jb.addActionListener(this);
			add(jb1);
			jb1.addActionListener(this);
		}
		protected void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			g.drawString("Your Support Our Potential - SBI BANK",x,30);
			if(x<=650){		x++;	}
			else
			{	x=0;	repaint();		}
			try
			{	Thread.sleep(35);	}
			catch(Exception e)
			{	System.out.println(e);	}
			repaint();
		}
		public void actionPerformed(ActionEvent ae)
		{
			if(ae.getSource()==jb)
			{	login();	}
			else
			if(ae.getSource()==jb1)
			{	register();		}
		}
	}
	public static void main(String[] ar)
	{	new bk();	}
}
