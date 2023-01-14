package Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import Model.Khupho;

public class CtrlAdd {
	Cnnect cn2=new Cnnect();
	Connection cnnadd=cn2.getCNN();
	//thêm khu phố
	public boolean addKP(Khupho kp) {
		String sql="INSERT INTO KHUPHO(MakhuPho,TenKhuPho)"
				+ "VALUES(?,?)";
		try {
			PreparedStatement ps =cnnadd.prepareStatement(sql);
			ps.setString(1,kp.getMakhupho());
			ps.setString(2,kp.getTenkhupho());
			return ps.executeUpdate() >0;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;
	}
	//dọc data ra
	public ArrayList<Khupho> getListKhupho(){
		ArrayList<Khupho> list=new ArrayList<>();
		String sql="SELECT *FROM KHUPHO";
		try {
			PreparedStatement ps=cnnadd.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				Khupho kp=new Khupho();
				kp.setMakhupho(rs.getString("MaKhuPho"));
				kp.setTenkhupho(rs.getString("TenKhuPho"));
				list.add(kp);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return list;
	}
	//thêm Người
	//thêm hộ dân 
	

}
