
/**
 * 1. The Sealed Interface: Defines the "Closed Universe"
 * 2. The Permits Clause: Only these three are allowed to exist.
 */
sealed interface Transaction permits Success, Failed, Pending {}

/**
 * 3. Records: Native Immutability.
 * No setters, no hidden state, 100% thread-safe.
 */
record Success(double amount, String txId) implements Transaction {}
record Failed(double amount, String reason) implements Transaction {}
record Pending(double amount) implements Transaction {}


public class ModernJava {
    public static void main(String[] args) {

        var history = java.util.List.of(
                new Success(15000.0, "TXN-001"),
                new Failed(45.00, "Insufficient funds"),
                new Pending(200.00)
        );
        System.out.println("Starting transaction");

        for (Transaction tx : history) {
            handleTransaction(tx);
        }
    }


    /**
     * This is where the magic happens.
     * Because 'Transaction' is sealed, the compiler knows exactly
     * what 'tx' could be.
     */
    private static void handleTransaction(Transaction tx) {

        String output = switch (tx){
            // "Pattern Matching": It checks the type AND casts it for you in one line
            case Success s -> "✅ APPROVED: ID " + s.txId() + " for $" + s.amount();
            case Failed f  -> "❌ REJECTED: $" + f.amount() + " - Reason: " + f.reason();
            case Pending p -> "⏳ PENDING: Validating $" + p.amount() + "...";

            // NO 'DEFAULT' CASE NEEDED!
            // The compiler proves this is exhaustive.
        };

        System.out.println(output);
    }
}