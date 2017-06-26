package com.phone.phone_datamodel.entities;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import com.phone.phone_datamodel.enums.BrandType;

public class PhoneTableModel extends AbstractTableModel{

	private List<Phone> data;
	
	private String columnNames[] = {"Id","OSType","Brand","Model","4G Enabled","Internal Memory","Battery (in mAh)","RAM (in GB)","CPU","GPU"};
	
	public String[] getColumnNames() {
		return columnNames;
	}


	private Object[][] tableData ;
	
	public PhoneTableModel(List<Phone> data) {
		this.data = data;
		setTableData(new Object[data.size()][columnNames.length]);
		fillTable();
	}
	
	
	public int getRowCount() {
		return data.size();
	}

	public int getColumnCount() {
		return columnNames.length;
	}

	public Object getValueAt(int rowIndex, int columnIndex) {
		return getTableData()[rowIndex][columnIndex];
	}
	
	
	private void fillTable()
	{
		for(int i=0;i<data.size();i++)
		{
			for(int j=0;j<columnNames.length;j++)
			{
				switch (j) {
				case 0:getTableData()[i][j]=data.get(i).getId();
					break;
				case 1:getTableData()[i][j]=data.get(i).getOperatingSystem().getDisplayString();
					break;
				case 2:getTableData()[i][j]=data.get(i).getFeatures().getBrand().getDisplayString();
					break;
				case 3:
					BrandType brandType = data.get(i).getFeatures().getBrand();
					switch (brandType) {
					case APPLE:getTableData()[i][j]=data.get(i).getFeatures().getModelApple();
								break;
					case SAMSUNG:getTableData()[i][j]=data.get(i).getFeatures().getModelSamsung();
								break;
					case HTC:getTableData()[i][j]=data.get(i).getFeatures().getModelHtc();
								break;
					case LG:getTableData()[i][j]=data.get(i).getFeatures().getModelLg();
								break;
					case LENOVO:getTableData()[i][j]=data.get(i).getFeatures().getModelLenovo();
								break;
					case ONEPLUS:getTableData()[i][j]=data.get(i).getFeatures().getModelOneplus();
								break;
					}	
						
				case 4:getTableData()[i][j]=data.get(i).getFeatures().isFourG();
					break;
				case 5:getTableData()[i][j]=data.get(i).getFeatures().getInternalMemory();
					break;
				case 6:getTableData()[i][j]=data.get(i).getFeatures().getBattery();
					break;
				case 7:getTableData()[i][j]=data.get(i).getFeatures().getRam();
					break;
				case 8:getTableData()[i][j]=data.get(i).getFeatures().getCpu();
					break;
				case 9:getTableData()[i][j]=data.get(i).getFeatures().getGpu();
					break;
						default:
					break;
				}
			}
		}
		
	}


	@Override
	public String getColumnName(int column) {
		return columnNames[column];
	}


	public Object[][] getTableData() {
		return tableData;
	}


	public void setTableData(Object[][] tableData) {
		this.tableData = tableData;
	}

	
	
	
	
	
}
