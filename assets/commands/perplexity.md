# TAGLINE

command-line interface for Perplexity AI, enabling terminal-based

# TLDR

**Ask a question** to Perplexity AI

```perplexity "What is quantum computing?"```

**Ask with a specific model**

```perplexity -m [sonar-pro] "[question]"```

**Display citations** with the answer

```perplexity -c "[question]"```

**Show token usage** statistics

```perplexity -u "[question]"```

**Search across notes and chats** with RAG

```perplexity rag "[query]"```

**Set up API key** and configuration

```perplexity setup```

# SYNOPSIS

**perplexity** [_options_] "_question_"

**perplexity** _command_ [_options_]

# PARAMETERS

**-m**, **--model** _model_
> Select language model: sonar, sonar-pro, sonar-reasoning, sonar-reasoning-pro.

**-c**, **--citations**
> Display source citations with the answer.

**-u**, **--usage**
> Show token consumption metrics.

**-v**, **--verbose**
> Enable debug mode with detailed output.

**-g**, **--glow**
> Apply Glow-compatible markdown formatting.

**-a**, **--api-key** _key_
> Provide API key directly instead of environment variable.

# COMMANDS

**ask** _question_
> Query Perplexity AI with optional model and topic parameters.

**rag** _query_
> Search across notes and chat history using RAG. Supports --mode (vector/keyword) and --source (notes/chats).

**rag-migrate**
> Migrate existing data to RAG knowledge base.

**rag-stats**
> View knowledge base statistics.

**history**
> Display chat history.

**note** --title _title_ --content _content_
> Create a new note with optional tags.

**list-notes**
> Display all saved notes.

**export-chat** _id_ --format _format_
> Export conversation to markdown, JSON, or Excel.

**setup**
> Configure API key and settings interactively.

# DESCRIPTION

**perplexity** is a command-line interface for Perplexity AI, enabling terminal-based access to their AI-powered search and question-answering capabilities. It leverages Perplexity's Sonar models which combine large language models with real-time web search.

The CLI supports multiple models ranging from **sonar** (fastest) to **sonar-reasoning-pro** (most capable with deep reasoning). Answers can include citations showing the sources used to generate responses.

Advanced features include RAG (Retrieval Augmented Generation) for searching across local notes and chat history using semantic vector search or keyword matching. The knowledge base uses BGE embeddings for lightning-fast semantic search.

Chat history and notes are stored locally, enabling export to markdown, JSON, or Excel formats. The tool works offline for local operations while requiring internet connectivity for AI queries.

# CAVEATS

Requires a **PERPLEXITY_API_KEY** environment variable with a valid API key from Perplexity. API usage incurs costs based on the model selected and tokens consumed. Some features require Python 3.12 or higher.

# HISTORY

Perplexity AI was founded in **2022** by former Google and Meta engineers, launching as an AI-powered search engine. The company introduced their API in **2024**, enabling programmatic access to their Sonar models. Community CLI tools emerged to provide terminal access, with various implementations supporting different feature sets from simple queries to advanced RAG capabilities.

# SEE ALSO

[anthropic](/man/anthropic)(1), [ollama](/man/ollama)(1), [llm](/man/llm)(1)
