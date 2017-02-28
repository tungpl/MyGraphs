package roadgraph;

import geography.GeographicPoint;
/**
 * A class to maintain Edge state
 * 
 * @author Tung Pham
 *
 */
public class MapEdge {
	
	private GeographicPoint from;
	private GeographicPoint to;
	private String roadName;
	private String roadType;
	private double length;
	/**
	 * Construction to initiate a MapEdge
	 */
	public MapEdge(GeographicPoint from, GeographicPoint to, String roadName,
			String roadType, double length){
		this.from = from;
		this.to= to;
		this.roadName = roadName;
		this.roadType = roadType;
		this.length = length;		
	}
// Getter and Setter methods
	public GeographicPoint getFrom() {
		return from;
	}

	public void setFrom(GeographicPoint from) {
		this.from = from;
	}

	public GeographicPoint getTo() {
		return to;
	}

	public void setTo(GeographicPoint to) {
		this.to = to;
	}

	public String getRoadName() {
		return roadName;
	}

	public void setRoadName(String roadName) {
		this.roadName = roadName;
	}

	public String getRoadType() {
		return roadType;
	}

	public void setRoadType(String roadType) {
		this.roadType = roadType;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
/*
 * (non-Javadoc)
 * @see java.lang.Object#hashCode()
 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((from == null) ? 0 : from.hashCode());
		long temp;
		temp = Double.doubleToLongBits(length);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((roadName == null) ? 0 : roadName.hashCode());
		result = prime * result + ((to == null) ? 0 : to.hashCode());
		return result;
	}
/*
 * (non-Javadoc)
 * @see java.lang.Object#equals(java.lang.Object)
 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MapEdge other = (MapEdge) obj;
		if (from == null) {
			if (other.from != null)
				return false;
		} else if (!from.equals(other.from))
			return false;
		if (Double.doubleToLongBits(length) != Double.doubleToLongBits(other.length))
			return false;
		if (roadName == null) {
			if (other.roadName != null)
				return false;
		} else if (!roadName.equals(other.roadName))
			return false;
		if (to == null) {
			if (other.to != null)
				return false;
		} else if (!to.equals(other.to))
			return false;
		return true;
	}
	

}
