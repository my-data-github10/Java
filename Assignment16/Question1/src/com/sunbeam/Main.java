package com.sunbeam;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int choice;
		do {
			System.out.println(
					"\n0.EXIT\n1.ADD CANDIDATE\n2.DELETE CANDIDATE\n3.UPDATE CANDIDATE DATAILS\n4.DISPLAY ALL\n5.INCREMENT VOTES BY 1\n6.GET CANDIATES OF GIVEN PARTY\n7.GET TOTAL VOTES OF A PARTY\n----------------------------------\n");
			System.out.println("Enter choice = ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				try (CandidateDao dao = new CandidateDao()) {
					System.out.println("Enter name = ");
					sc.nextLine();
					String name = sc.nextLine();

					System.out.println("Enter party = ");
					String party = sc.nextLine();

					System.out.println("Enter votes = ");
					int votes = sc.nextInt();

					Candidate c = new Candidate(name, party, votes);

					int cnt = dao.addCandidate(c);
					System.out.println("Rows updated = " + cnt);
				} // dao.close();
				catch (SQLException e) {
					e.printStackTrace();
				}
				break;

			case 2:
				try (CandidateDao dao = new CandidateDao()) {
					System.out.print("Enter candidate id to be deleted: ");
					int id = sc.nextInt();
					int cnt = dao.deleteById(id);
					System.out.println("Candidates deleted: " + cnt);
				} // dao.close();
				catch (Exception e) {
					e.printStackTrace();
				}
				break;

			case 3:
				try (CandidateDao dao = new CandidateDao()) {
					System.out.println("Enter desired name: ");
					sc.nextLine();
					String name = sc.nextLine();

					System.out.println("Enter party : ");
					String party = sc.nextLine();

					System.out.println("Enter candidate id to update name: ");
					int candiateId = sc.nextInt();

					int cnt = dao.updateById(name, party, candiateId);
					System.out.println("Rows updated: " + cnt);
				} // dao.close();
				catch (Exception e) {
					e.printStackTrace();
				}
				break;

			case 4:
				try (CandidateDao dao = new CandidateDao()) {
					List<Candidate> list = dao.findAll();
					list.forEach(c -> System.out.println(c));
				} // dao.close();
				catch (Exception e) {
					e.printStackTrace();
				}
				break;

			case 5:
				try (CandidateDao dao = new CandidateDao()) {
					System.out.print("Enter candidate id (to vote): ");
					int candidateId = sc.nextInt();
					int cnt = dao.incrementVote(candidateId);
					System.out.println("Rows updated: " + cnt);
				} // dao.close();
				catch (Exception e) {
					e.printStackTrace();
				}
				break;

			case 6:
				try (CandidateDao dao = new CandidateDao()) {
					System.out.print("Enter party: ");
					String party = sc.next();
					List<Candidate> list = dao.findByParty(party);
					list.forEach(c -> System.out.println(c));
				} // dao.close();
				catch (Exception e) {
					e.printStackTrace();
				}
				break;
				
			case 7:
				List<PartyVotes> pv = new ArrayList<PartyVotes>();
				try(CandidateDao dao = new CandidateDao()){
					pv = dao.getPartywiseVotes();
					pv.forEach(c->System.out.println(c));
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		} while (choice != 0);

	}

}