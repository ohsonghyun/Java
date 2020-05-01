package c_statement;

import java.util.Scanner;

public class SimLiTest {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		String q1 = "나는 금사빠다(금방 사랑에 빠진다)";
		String q2 = "연애할 때는 끌려다니는 타입이다";
		String q3 = "데이트 코스는 미리 짜는게 편하다";
		String q4 = "감정기복이 크지 않다";
		String q5 = "감정 표현에 솔직한 편이다";
		String q6 = "활동적인 데이트가 좋다";
		String q7 = "연락이 없어도 믿고 기다리는 편이다";
		String q8 = "이성친구는 존재할 수 없다";
		String q9 = "아무것도 아닌 일에 쉽게 섭섭함이 쌓인다";
		String result = null;
		String input;

		System.out.println("나의 연애 유형은? 말해 YES or NO!");
		System.out.println("START!");

		System.out.println(q1);
		String reply = s.nextLine();

		if(reply.equals("Yes") || reply.equals("yes")){
			System.out.println(q2);
			reply = s.nextLine();
			if(reply.equals("Yes") || reply.equals("yes")){
				System.out.println(q5);
				reply = s.nextLine();
				if(reply.equals("Yes") || reply.equals("yes")){
					System.out.println(q8);
					reply = s.nextLine();
					if(reply.equals("Yes") || reply.equals("yes")){
						System.out.println(q9);
						reply = s.nextLine();
						if(reply.equals("Yes") || reply.equals("yes")){
							result = "D";
						}else if(reply.equals("No") || reply.equals("no")){
							result = "C";
						}

					}else if(reply.equals("No") || reply.equals("no")){
						result = "B";
					}

				}else if(reply.equals("No") || reply.equals("no")){
					System.out.println(q6);
					reply = s.nextLine();
					if(reply.equals("Yes") || reply.equals("yes")){
						System.out.println(q8);
						reply = s.nextLine();
						if(reply.equals("Yes") || reply.equals("yes")){
							System.out.println(q9);
							reply = s.nextLine();
							if(reply.equals("Yes") || reply.equals("yes")){
								result = "D";
							}else if(reply.equals("No") || reply.equals("no")){
								result = "C";
							}

						}else if(reply.equals("No") || reply.equals("no")){
							result = "B";
						}

					}else if(reply.equals("No") || reply.equals("no")){
						System.out.println(q9);
						reply = s.nextLine();
						if(reply.equals("Yes") || reply.equals("yes")){
							result = "D";
						}else if(reply.equals("No") || reply.equals("no")){
							result = "C";
						}

					}

				}

			}else if(reply.equals("No") || reply.equals("no")){
				System.out.println(q3);
				reply = s.nextLine();
				if(reply.equals("Yes") || reply.equals("yes")){
					System.out.println(q6);
					reply = s.nextLine();
					if(reply.equals("Yes") || reply.equals("yes")){
						System.out.println(q8);
						reply = s.nextLine();
						if(reply.equals("Yes") || reply.equals("yes")){
							System.out.println(q9);
							reply = s.nextLine();
							if(reply.equals("Yes") || reply.equals("yes")){
								result = "D";
							}else if(reply.equals("No") || reply.equals("no")){
								result = "C";
							}

						}else if(reply.equals("No") || reply.equals("no")){
							result = "B";
						}

					}else if(reply.equals("No") || reply.equals("no")){
						System.out.println(q9);
						reply = s.nextLine();
						if(reply.equals("Yes") || reply.equals("yes")){
							result = "D";
						}else if(reply.equals("No") || reply.equals("no")){
							result = "C";
						}

					}

				}else if(reply.equals("No") || reply.equals("no")){
					System.out.println(q5);
					reply = s.nextLine();
					if(reply.equals("Yes") || reply.equals("yes")){
						System.out.println(q8);
						reply = s.nextLine();
						if(reply.equals("Yes") || reply.equals("yes")){
							System.out.println(q9);
							reply = s.nextLine();
							if(reply.equals("Yes") || reply.equals("yes")){
								result = "D";
							}else if(reply.equals("No") || reply.equals("no")){
								result = "C";
							}

						}else if(reply.equals("No") || reply.equals("no")){
							result = "B";
						}

					}else if(reply.equals("No") || reply.equals("no")){
						System.out.println(q6);
						reply = s.nextLine();
						if(reply.equals("Yes") || reply.equals("yes")){
							System.out.println(q8);
							reply = s.nextLine();
							if(reply.equals("Yes") || reply.equals("yes")){
								System.out.println(q9);
								reply = s.nextLine();
								if(reply.equals("Yes") || reply.equals("yes")){
									result = "D";
								}else if(reply.equals("No") || reply.equals("no")){
									result = "C";
								}

							}else if(reply.equals("No") || reply.equals("no")){
								result = "B";
							}

						}else if(reply.equals("No") || reply.equals("no")){
							System.out.println(q9);
							reply = s.nextLine();
							if(reply.equals("Yes") || reply.equals("yes")){
								result = "D";
							}else if(reply.equals("No") || reply.equals("no")){
								result = "C";
							}

						}

					}

				}

			}

		}else if(reply.equals("No") || reply.equals("no")){
			System.out.println(q4);
			reply = s.nextLine();
			if(reply.equals("Yes") || reply.equals("yes") || reply.equals("Yes") || reply.equals("yes")){
				System.out.println(q7);
				reply = s.nextLine();
				if(reply.equals("Yes") || reply.equals("yes")){
					result = "A";
				}else if(reply.equals("No") || reply.equals("no")){
					System.out.println(q8);
					reply = s.nextLine();
					if(reply.equals("Yes") || reply.equals("yes")){
						System.out.println(q9);
						reply = s.nextLine();
						if(reply.equals("Yes") || reply.equals("yes")){
							result = "D";
						}else if(reply.equals("No") || reply.equals("no")){
							result = "C";
						}

					}else if(reply.equals("No") || reply.equals("no")){
						result = "B";
					}

				}

			}else if(reply.equals("No") || reply.equals("no")){
				System.out.println(q5);
				reply = s.nextLine();
				if(reply.equals("Yes") || reply.equals("yes")){
					System.out.println(q8);
					reply = s.nextLine();
					if(reply.equals("Yes") || reply.equals("yes")){
						System.out.println(q9);
						reply = s.nextLine();
						if(reply.equals("Yes") || reply.equals("yes")){
							result = "D";
						}else if(reply.equals("No") || reply.equals("no")){
							result = "C";
						}

					}else if(reply.equals("No") || reply.equals("no")){
						result = "B";
					}

				}else if(reply.equals("No") || reply.equals("no")){
					System.out.println(q6);
					reply = s.nextLine();
					if(reply.equals("Yes") || reply.equals("yes")){
						System.out.println(q8);
						reply = s.nextLine();
						if(reply.equals("Yes") || reply.equals("yes")){
							System.out.println(q9);
							reply = s.nextLine();
							if(reply.equals("Yes") || reply.equals("yes")){
								result = "D";
							}else if(reply.equals("No") || reply.equals("no")){
								result = "C";
							}

						}else if(reply.equals("No") || reply.equals("no")){
							result = "B";
						}

					}else if(reply.equals("No") || reply.equals("no")){
						System.out.println(q9);
						reply = s.nextLine();
						if(reply.equals("Yes") || reply.equals("yes")){
							result = "D";
						}else if(reply.equals("No") || reply.equals("no")){
							result = "C";
						}
					}

				}

			}


		}

		if(result.equals("A")){
			System.out.println("A Type: 서로에 대한 신뢰감이 깊고, 존중해주는 어른스러운 연애를 하는 타입!");
		}else if(result.equals("B")){
			System.out.println(" Type: 구속을 하는 것도, 받는 것도 싫은 자유로운 연애를 하는 타입!");
		}else if(result.equals("C")){
			System.out.println(" Type: 이것은 의리인가 사랑인가... 친구같이 편안한 연애를 하는 타입!");
		}else if(result.equals("D")){
			System.out.println(" Type: 무조건 잘해주고, 무조건 맞춰주는 다 퍼주는 연애를 하는 타입!");
		}
	}
}
