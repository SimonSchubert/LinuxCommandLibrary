# TAGLINE

open-source crypto trading bot framework

# TLDR

**Start the interactive TUI** from a source checkout

```make run```

**Start the interactive TUI** with the launcher script

```./bin/hummingbot_quickstart.py```

**Start with a strategy config** from conf/

```./bin/hummingbot_quickstart.py -f [config.yml] -p [password]```

**Start with a V2 config** from conf/scripts/

```./bin/hummingbot_quickstart.py --v2 [config.yml]```

**Run without the TUI** (headless)

```./bin/hummingbot_quickstart.py --headless --v2 [config.yml]```

**Start a config** with the non-interactive CLI

```hbot start [config.yml]```

**Check on** a running bot

```hbot status```

**Stop** a running bot

```hbot stop```

# SYNOPSIS

**hummingbot_quickstart.py** [_options_]

**hbot** _command_ [_options_]

# PARAMETERS

**-f** _FILE_, **--config-file-name** _FILE_
> File in conf/ to load as the strategy config file.

**--v2** _FILE_
> V2 strategy config file name, from conf/scripts/.

**-p** _PASSWORD_, **--config-password** _PASSWORD_
> Password to unlock encrypted files.

**--auto-set-permissions** _VALUE_
> Try to automatically set config, logs and data directory permissions, useful for Docker containers.

**--headless**
> Run without the CLI interface.

**-h**, **--help**
> Display help.

# DESCRIPTION

**hummingbot** is an open-source cryptocurrency trading bot framework that provides an interactive terminal interface for automated trading. It supports strategies such as market making, arbitrage, and liquidity mining across centralized and decentralized exchanges.

The TUI provides real-time status updates, order tracking, and profit/loss reporting. Users configure strategies through interactive prompts or YAML configuration files. The bot supports paper trading mode for testing strategies without risking funds.

The project recommends the **hbot** command-line interface for running, controlling and monitoring a bot non-interactively, with commands such as **create**, **connect**, **start**, **status**, **logs**, **history** and **stop**. The classic TUI is the Docker default and runs from source with **make install** followed by **make run**.

# CAVEATS

No **hummingbot** executable is installed: the entry points are the **bin/hummingbot_quickstart.py** script and **hbot**. Requires API keys from supported exchanges. Trading involves financial risk. Requires Python 3.10.12+ and a conda environment created by **make install**, or Docker. Passing a password with **-p** can expose it in process listings and shell history.

# SEE ALSO

[freqtrade](/man/freqtrade)(1), [gocryptotrader](/man/gocryptotrader)(1), [cointop](/man/cointop)(1)

# RESOURCES

```[Source code](https://github.com/hummingbot/hummingbot)```

```[Homepage](https://hummingbot.org)```

```[Documentation](https://hummingbot.org/installation/)```

<!-- verified: 2026-11-09 -->
