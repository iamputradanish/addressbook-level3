package seedu.addressbook.commands;

public class PasswordCommand extends Command {
    public static final String COMMAND_WORD = "12345678";
    public static final String MESSAGE_CORRECT_PASSWORD = "Welcome user.";

    @Override
    public CommandResult execute() {
        return new CommandResult(MESSAGE_CORRECT_PASSWORD);
    }
}