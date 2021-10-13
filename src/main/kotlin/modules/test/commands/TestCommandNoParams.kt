package modules.test.commands

import commands.PreParseContext
import commands.TextCommand
import commands.TextCommandContext
import net.dv8tion.jda.api.entities.Message
import utils.sendSafe

class TestCommandNoParams : TextCommand<Unit>(
    arrayListOf("no-params")
) {
    override fun parameterBuilder(message: Message, paramsParsed: HashMap<String, Any>) {
        return
    }

    override fun check(context: PreParseContext): Boolean {
        return true
    }

    override fun handler(context: TextCommandContext<Unit>) {
        context.channel.sendSafe("hi hi hello").queue()
    }
}