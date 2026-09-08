# TAGLINE

Multi-agent LLM financial trading framework

# TLDR

Start the **interactive analysis wizard** (ticker, date, analysts, LLM)

```tradingagents analyze```

**Resume a crashed run** from the last saved graph node

```tradingagents analyze --checkpoint```

**Delete saved checkpoints** and start a fresh analysis

```tradingagents analyze --clear-checkpoints```

Run from **Docker Compose** (copy `.env.example` to `.env` first)

```docker compose run --rm tradingagents analyze```

Run against a **local Ollama** instance via Compose

```docker compose --profile ollama run --rm tradingagents-ollama analyze```

Run from a **source checkout** without installing the console script

```python -m cli.main analyze```

# SYNOPSIS

**tradingagents** [**--install-completion**] [**--show-completion**] [**--help**] _command_ [_options_]

**tradingagents analyze** [**--checkpoint** | **--no-checkpoint**] [**--clear-checkpoints**]

# PARAMETERS

**analyze**
> Run the interactive CLI: pick a ticker, analysis date, output language, analyst team, research depth, LLM provider, and models, then stream the multi-agent debate.

**--checkpoint**
> Enable LangGraph checkpoint-resume for this run so a crash can continue from the last successful node. Omit the flag to honor **TRADINGAGENTS_CHECKPOINT_ENABLED**.

**--no-checkpoint**
> Disable checkpoint-resume for this run even if the environment enables it.

**--clear-checkpoints**
> Delete all saved per-ticker checkpoint databases under the cache directory, then run **analyze**.

**--install-completion** / **--show-completion**
> Install or print shell completion for **tradingagents** (Typer).

**-h**, **--help**
> Show help for the program or a subcommand.

# DESCRIPTION

**tradingagents** is the command-line entry point for TradingAgents, an open-source multi-agent framework that mimics a trading desk. Specialized LLM agents (market, sentiment, news, and fundamentals analysts; bull and bear researchers; a trader; risk analysts; and a portfolio manager) debate a ticker and emit a buy / overweight / hold / underweight / sell-style decision.

The CLI is a Rich TUI. After the wizard, it streams agent status, tool calls, and report sections, then can save a report tree under `reports/` and display the full write-up. Results for each ticker and date are also written under **~/.tradingagents/logs/** (or **TRADINGAGENTS_RESULTS_DIR**). A decision log at **~/.tradingagents/memory/trading_memory.md** records completed runs so later analyses can reflect on what happened.

Tickers follow Yahoo Finance conventions, including exchange suffixes (`0700.HK`, `7203.T`, `AZN.L`) and crypto pairs (`BTC-USD`). The same package can be imported as a Python library (`TradingAgentsGraph.propagate()`).

# CAVEATS

The project is a **research scaffold**, not trading, investment, or financial advice. LLM sampling and live news/social feeds make two runs of the same ticker and date differ; reasoning models largely ignore temperature. Cloud providers and optional data vendors (Alpha Vantage, FRED) need API keys and incur usage cost. Requires **Python 3.10+** (3.12 is the documented default). The interactive wizard needs a real terminal; piped or headless environments should set **TRADINGAGENTS_*** variables instead.

# CONFIGURATION

**.env**
> Copied from `.env.example` in the project directory. Holds provider keys (`OPENAI_API_KEY`, `ANTHROPIC_API_KEY`, `GOOGLE_API_KEY`, `XAI_API_KEY`, and others), optional **FRED_API_KEY**, **OLLAMA_BASE_URL**, and **TRADINGAGENTS_*** overrides.

**TRADINGAGENTS_LLM_PROVIDER**
> Provider id (`openai`, `google`, `anthropic`, `ollama`, `openai_compatible`, ...). When set, the CLI skips the provider prompt.

**TRADINGAGENTS_DEEP_THINK_LLM** / **TRADINGAGENTS_QUICK_THINK_LLM**
> Model ids for deep reasoning versus quick tasks.

**TRADINGAGENTS_LLM_BACKEND_URL**
> Override the provider endpoint (vLLM, LM Studio, llama.cpp, or a remote Ollama).

**TRADINGAGENTS_OUTPUT_LANGUAGE**
> Language for analyst reports and the final decision (internal debate stays in English).

**TRADINGAGENTS_MAX_DEBATE_ROUNDS** / **TRADINGAGENTS_MAX_RISK_ROUNDS**
> Debate and risk-discussion round counts. Setting both skips the research-depth prompt.

**TRADINGAGENTS_CHECKPOINT_ENABLED**
> Default for checkpoint-resume when **--checkpoint** / **--no-checkpoint** is omitted.

**TRADINGAGENTS_CACHE_DIR**
> Checkpoint SQLite files live at `$TRADINGAGENTS_CACHE_DIR/checkpoints/<TICKER>.db` (default **~/.tradingagents/cache**).

**TRADINGAGENTS_MEMORY_LOG_PATH**
> Decision-log path (default **~/.tradingagents/memory/trading_memory.md**).

**TRADINGAGENTS_RESULTS_DIR**
> Per-run logs and reports (default **~/.tradingagents/logs**).

# HISTORY

TradingAgents was introduced in **2024** by Yijia Xiao, Edward Sun, Di Luo, and Wei Wang (Tauric Research) in the paper *TradingAgents: Multi-Agents LLM Financial Trading Framework* (arXiv:2412.20138). The CLI, LangGraph pipeline, and provider registry have been developed in the open since then. Version **0.4.0** (August 2026) added working CLI checkpoint resume, look-ahead / point-in-time data fixes, and additional model coverage. Licensed under **Apache License 2.0**.

# SEE ALSO

[llm](/man/llm)(1), [ollama](/man/ollama)(1), [freqtrade](/man/freqtrade)(1), [pip](/man/pip)(1)

# RESOURCES

```[Source code](https://github.com/TauricResearch/TradingAgents)```

```[Homepage](https://tauric.ai)```

```[Documentation](https://tauricresearch.github.io/TradingAgents/)```

<!-- verified: 2026-09-08 -->
