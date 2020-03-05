package com.data.structure;

import java.io.*;
import java.util.*;

public class CandidateCode {

	public static void main(String args[]) throws Exception {

		Scanner sca = new Scanner(System.in);
		int n = sca.nextInt();
		int m = sca.nextInt();
		int k = sca.nextInt();
		int affectedCity[] = new int[k];
		int distanse[][] = new int[m][3];

		for (int i = 0; i < k; i++) {

			affectedCity[i] = sca.nextInt();
		}

		int firstAffectedCirty = affectedCity[0];
		int calDistFrom = 0;
		boolean getValue = false;

		for (int i = 0; i < m; i++) {

			int firstcity = 0;
			int secoundcity = 0; // privious city
			for (int j = 0; j < 3; j++) {

				distanse[i][j] = sca.nextInt();
				if (firstcity == firstAffectedCirty && !getValue) {

					calDistFrom = secoundcity;
					getValue = true;
				}

				if (j != 2) {

					secoundcity = firstcity;
					firstcity = distanse[i][j];
				}
			}

		}

		int num = affectedCity[0];
		int startingPoint = calDistFrom;
		int priviousTotal = 0;
		int totalDistanse = 0;
		boolean change = false;
		int count = 0;
		int index = 0;
		for (int i = 0; i < m; i++) {

			index = i;

			if (num == distanse[i][1] && calDistFrom == distanse[i][0]) {

				if (count < k) {

					priviousTotal = totalDistanse;
					totalDistanse = distanse[i][2] + totalDistanse;
					count++;
					change = true;
					if (count < k) {

						calDistFrom = num;
						num = affectedCity[count];
					} else {

						count = 1000;
						break;
					}
				} else {

					count = 1000;
					break;
				}

				if (count == 1000) {

					break;
				}
			}

			if (count == 1000) {

				break;
			}

		}

		if (distanse[--index][0] == startingPoint) {

			totalDistanse = totalDistanse + distanse[index][2];
		} else
			totalDistanse = totalDistanse + totalDistanse;
		System.out.println(totalDistanse);

	}
}
