# TAGLINE

Mock infrastructure for AI application testing

# TLDR

**Start** a mock server with fixtures

```npx aimock -p [4010] -f [./fixtures]```

**Start** from a configuration file

```npx aimock --config [aimock.json]```

**Record** real API responses as fixtures

```npx aimock --record --provider-openai [https://api.openai.com]```

**Convert** fixtures from another tool

```npx aimock convert [vidaimock] [./templates/] [./fixtures/]```

**Run** with Docker

```docker run -d -p 4010:4010 -v [./fixtures]:/fixtures ghcr.io/copilotkit/aimock -f /fixtures```

# SYNOPSIS

**npx aimock** [_options_]

**npx aimock convert** _format_ _source_ _destination_

# PARAMETERS

**-p, --port** _number_
> Port to listen on (default: 4010)

**-f, --fixtures** _directory_
> Path to the fixtures directory

**--config** _file_
> Load configuration from a JSON file

**--record**
> Enable record mode to proxy real APIs and save responses as fixtures

**--provider-openai** _url_
> OpenAI provider URL for proxying in record mode

**convert** _format_ _source_ _dest_
> Convert fixtures from other tools (vidaimock, mockllm)

# DESCRIPTION

**aimock** is deterministic mock infrastructure for testing AI applications. It mocks LLM APIs, image generation, text-to-speech, transcription, video generation, MCP tools, A2A agents, AG-UI event streams, vector databases, search, rerank, and moderation — all from one package on one port with zero dependencies.

The tool supports **11 LLM providers** including OpenAI, Claude, Gemini, Bedrock, Azure, Vertex AI, Ollama, and Cohere with full streaming support. **Record & Replay** mode proxies real APIs and saves responses as fixtures for deterministic test playback. Chaos testing capabilities allow simulating failures and edge cases.

aimock runs daily against real provider APIs and catches response format changes within 24 hours, maintaining fixture compatibility. It is built entirely on Node.js builtins with no external dependencies.

# CAVEATS

Intended for **testing environments only**, not production deployment. Requires **Node.js** for npx usage or Docker for containerized deployment. Record mode requires valid API keys for the providers being recorded. Fixture format is specific to aimock and may need conversion from other mocking tools.

# HISTORY

aimock was created by the **CopilotKit** team and written in **TypeScript**. It was developed to address the challenge of testing AI applications that may touch multiple external services in a single request — LLMs, tool servers, vector databases, rerankers, and moderation layers — providing a single mock server that covers the entire agentic stack.

# SEE ALSO

[node](/man/node)(1), [npx](/man/npx)(1), [docker](/man/docker)(1)
