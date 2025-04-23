package patterns;

public class AlphabetPatterns {
	public static void A(int n) {
		int mid = n / 2;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 || j == 0 || j == n - 1 || i == mid) {
					System.out.print(" * ");
				} else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}

	public static void B(int n) {
		int mid = n / 2;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 || j == 0 || j == n - 1 || i == mid || i == n - 1) {
					if ((i == 0 && j == n - 1) || (i == n - 1 && j == n - 1) || ((i == mid && j == n - 1))) {
						System.out.print(" ");
					} else {
						System.out.print(" * ");
					}
				} else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}

	}

	public static void C(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 || j == 0 || i == n - 1) {
					System.out.print(" * ");
				} else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}

	public static void D(int n) {

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
					if ((i == 0 && j == n - 1) || (i == n - 1 && j == n - 1)) {
						System.out.print("   ");
					} else {
						System.out.print(" * ");
					}
				} else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}

	}

	public static void E(int n) {
		for (int i = 0; i < n; i++) {
			int mid = n / 2;
			for (int j = 0; j < n; j++) {
				if (i == 0 || j == 0 || i == mid || i == n - 1) {
					System.out.print(" * ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();

		}
	}

	public static void F(int n) {
		for (int i = 0; i < n; i++) {
			int mid = n / 2;
			for (int j = 0; j < n; j++) {
				if (i == 0 || j == 0 || i == mid) {
					System.out.print(" * ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();

		}
	}

	public static void G(int n) {
		int mid = n / 2;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 || j == 0 || i == n - 1 || (i == mid && j > mid) || (j == n - 1 && i > mid)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void H(int n) {
		for (int i = 0; i < n; i++) {
			int mid = n / 2;
			for (int j = 0; j < n; j++) {
				if (j == 0 || j == n - 1 || i == mid) {
					System.out.print(" $ ");
				} else {
					System.out.print("   ");
				}

			}
			System.out.println();
		}
	}

	public static void I(int n) {
		for (int i = 0; i < n; i++) {
			int mid = n / 2;
			for (int j = 0; j < n; j++) {
				if (i == 0 || i == n - 1 || j == mid) {
					System.out.print(" * ");
				} else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}

	public static void J(int n) {
		for (int i = 0; i < n; i++) {
			int mid = n / 2;
			for (int j = 0; j < n; j++) {
				if (i == 0 || j == mid || (i == n - 1 && j < mid)) {
					System.out.print(" * ");
				} else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}

	public static void K(int n) {
		for (int i = 0; i < n - 1; i++) {
			int mid = n / 2;
			for (int j = 0; j < n; j++) {
				if (j == 0 || i + j == n - 1) {
					System.out.print(" * ");
				} else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
		for (int i = 0; i < n; i++) {
			int mid = n / 2;
			for (int j = 0; j < n; j++) {
				if (j == 0 || i == j) {
					System.out.print(" * ");
				} else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}

	public static void L(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j == 0 || i == n - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}
	}

	public static void M(int n) {
		for (int i = 0; i < n; i++) {
			int mid = n / 2;
			for (int j = 0; j < n; j++) {
				if (j == 0 || j == n - 1 || (i == j && j < mid) || (i + j == n - 1 && i < mid)) {
					System.out.print(" * ");
				} else {
					System.out.print("   ");
				}

			}
			System.out.println();
		}
	}

	public static void N(int n) {
		for (int i = 0; i < n; i++) {
			int mid = n / 2;
			for (int j = 0; j < n; j++) {
				if (j == 0 || i == j || j == n - 1) {
					System.out.print(" * ");
				} else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}

	public static void O(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
					if ((i == 0 && j == n - 1) || (i == n - 1 && j == n - 1) || (i == 0 && j == 0)
							|| (i == n - 1 && j == 0)) {
						System.out.print("   ");
					} else {
						System.out.print(" * ");
					}
				} else {
					System.out.print("   ");
				}

			}
			System.out.println();
		}

	}

	public static void P(int n) {
		for (int i = 0; i < n; i++) {
			int mid = n / 2;
			for (int j = 0; j < n; j++) {
				if (i == 0 || j == 0 || i == mid || (j == n - 1 && i < mid)) {
					System.out.print(" * ");
				} else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}

	}

	public static void R(int n) {
		for (int i = 0; i < n; i++) {
			int mid = n / 2;
			for (int j = 0; j < n; j++) {
				if (i == 0 || j == 0 || i == mid || (j == n - 1 && i < mid) || (i == j && i > mid)) {
					System.out.print(" * ");
				} else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}

	}

	public static void S(int n) {
		for (int i = 0; i < n; i++) {
			int mid = n / 2;
			for (int j = 0; j < n; j++) {
				if (i == 0 || i == n - 1 || (j == 0 && i < mid) || (j == n - 1 && i > mid) || i == mid) {
					System.out.print(" * ");
				} else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}

	}

	public static void T(int n) {
		for (int i = 0; i < n; i++) {
			int mid = n / 2;
			for (int j = 0; j < n; j++) {
				if (i == 0 || j == mid) {
					System.out.print(" * ");
				} else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}

	}

	public static void U(int n) {
		for (int i = 0; i < n; i++) {
			int mid = n / 2;
			for (int j = 0; j < n; j++) {
				if (i == n - 1 || j == 0 || j == n - 1) {
					if ((i == n - 1 && j == 0) || i == n - 1 && j == n - 1) {
						System.out.print("   ");
					} else {
						System.out.print(" * ");
					}
				} else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}

	}

	public static void V(int n) {
		for (int i = 0; i < n; i++) {
			int mid = n / 2;
			for (int j = 0; j < n; j++) {
				if ((i == j && i < mid) || (i + j == n - 1 && i < mid)) {
					System.out.print(" * ");

				} else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}

	}

	public static void W(int n) {
		for (int i = 0; i < n; i++) {
			int mid = n / 2;
			for (int j = 0; j < n; j++) {
				if (j == 0 || j == n - 1 || (i + j == n - 1 && i > mid) || (i == j && i > mid)) {
					System.out.print(" * ");
				} else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}

	}

	public static void X(int n) {
		for (int i = 0; i < n; i++) {
			int mid = n / 2;
			for (int j = 0; j < n; j++) {
				if (i == j || i + j == n - 1) {
					System.out.print(" * ");

				} else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}

	}

	public static void Y(int n) {
		for (int i = 0; i < n; i++) {
			int mid = n / 2;
			for (int j = 0; j < n; j++) {
				if (i + j == n - 1 || (i == j && i < mid)) {
					System.out.print(" * ");
				} else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}

	}

	public static void Z(int n) {
		for (int i = 0; i < n; i++) {
			int mid = n / 2;
			for (int j = 0; j < n; j++) {
				if (i + j == n - 1 || i == 0 || i == n - 1) {
					System.out.print(" * ");
				} else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {

		A(8);
		System.out.println("-----------------------------");
		B(8);
		System.out.println("-----------------------------");

		C(8);
		System.out.println("-----------------------------");

		D(8);
		System.out.println("-----------------------------");

		E(8);
		System.out.println("-----------------------------");

		F(8);
		System.out.println("-----------------------------");

		G(8);
		System.out.println("-----------------------------");

		H(8);
		System.out.println("-----------------------------");

		I(8);
		System.out.println("-----------------------------");

		J(8);
		System.out.println("-----------------------------");

		K(8);
		System.out.println("-----------------------------");

		L(8);
		System.out.println("-----------------------------");

		M(8);
		System.out.println("-----------------------------");

		N(8);
		System.out.println("-----------------------------");

		O(8);
		System.out.println("-----------------------------");

		P(8);
		System.out.println("-----------------------------");

		R(8);
		System.out.println("-----------------------------");

		S(8);
		System.out.println("-----------------------------");
		T(8);
		System.out.println("-----------------------------");

		U(8);
		System.out.println("-----------------------------");

		V(8);
		System.out.println("-----------------------------");

		W(8);
		System.out.println("-----------------------------");

		X(8);
		System.out.println("-----------------------------");

		Y(8);
		System.out.println("-----------------------------");

		Z(8);
		System.out.println("-----------------------------");

	}

}
