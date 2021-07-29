package com.javaex.api.collection.hash;

public class ClassRoom {

	
		private String subject;
		private String roomName;
		
		public ClassRoom(String subject) {
			this.subject = subject;
		}
		
		public ClassRoom(String subject, String roomName) {
			super();
			this.subject = subject;
			this.roomName = roomName;
		}

		@Override
		public String toString() {
			return "ClassRoom [subject=" + subject + ", roomName=" + roomName + "]";
		}
		
		@Override
		public boolean equals(Object obj) {
			if(obj instanceof ClassRoom) {
				ClassRoom other = (ClassRoom)obj;
				return subject.equals(other.subject);
			}
			
		return super.equals(obj);
		}
		
		@Override
		public int hashCode() {
		
		return subject.hashCode();
		}
		
		
		
	

}
