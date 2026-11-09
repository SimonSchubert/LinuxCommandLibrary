# TAGLINE

Mock infrastructure for AI application testing

# TLDR

**Start** an LLM mock server with fixtures

```npx -p @copilotkit/aimock llmock -p [4010] -f [./fixtures]```

**Start** the full suite from a configuration file

```npx @copilotkit/aimock --config [aimock.json]```

**Record** real API responses as fixtures

```npx -p @copilotkit/aimock llmock --record --provider-openai [https://api.openai.com]```

**Replay** recorded fixtures at twice the speed

```npx -p @copilotkit/aimock llmock -p [4010] -f [./fixtures] --replay-speed [2]```

**Convert** fixtures from another tool

```npx @copilotkit/aimock convert [vidaimock] [./templates/] [./fixtures/vidaimock.json]```

**Validate** fixtures offline

```npx @copilotkit/aimock validate [./fixtures/]```

**Run** with Docker

```docker run -d -p 4010:4010 -v "$(pwd)/[fixtures]:/fixtures" ghcr.io/copilotkit/aimock -f /fixtures -h 0.0.0.0```

# SYNOPSIS

**npx @copilotkit/aimock** **--config** _file_ [_options_]

**npx -p @copilotkit/aimock llmock** [_options_]

**npx @copilotkit/aimock convert** _format_ _input_ [_output_]

**npx @copilotkit/aimock validate** [**--strict**] [**--json**] _path_...

# PARAMETERS

**-c, --config** _file_
> Load configuration from a JSON file (**aimock** only, required)

**-p, --port** _number_
> Port to listen on (**llmock** default: 4010)

**-h, --host** _address_
> Host to bind to (**llmock** default: 127.0.0.1)

**-f, --fixtures** _source_
> Fixture directory, .json file, or HTTP(S) URL (**llmock**, repeatable, default: ./fixtures)

**-w, --watch**
> Reload when fixtures change (**llmock**)

**--record**
> Enable record mode to proxy real APIs and save responses as fixtures (**llmock**)

**--proxy-only**
> Forward unmatched requests without saving them (**llmock**)

**--strict**
> Fail on unmatched requests (**llmock**)

**--validate-on-load**
> Validate fixture schemas at startup (**llmock**)

**--replay-speed** _n_
> Replay speed multiplier (**llmock**, default: 1.0)

**--provider-openai** _url_
> Upstream OpenAI URL for proxying in record mode. Matching options exist for anthropic, gemini, vertexai, bedrock, azure, ollama, cohere, openrouter, and byteplus

**--chaos-drop**, **--chaos-malformed**, **--chaos-disconnect**, **--chaos-ratelimit** _rate_
> Probability (0-1) of injecting the given failure (**llmock**)

**--chaos-latency** _ms_
> Delay injected before handling a request (**llmock**)

**--metrics**
> Enable Prometheus metrics at GET /metrics (**llmock**)

**convert** _format_ _input_ [_output_]
> Convert fixtures from other tools (vidaimock, mockllm)

**validate** [**--strict**] [**--json**] _path_...
> Lint fixture files or directories offline without starting a server

# DESCRIPTION

**aimock** is deterministic mock infrastructure for testing AI applications. It mocks LLM APIs, image generation, text-to-speech, transcription, video generation, MCP tools, A2A agents, AG-UI event streams, vector databases, search, rerank, and moderation, all from one package on one port with zero dependencies.

The tool supports **11 LLM providers** including OpenAI, Claude, Gemini, Bedrock, Azure, Vertex AI, Ollama, and Cohere with full streaming support. **Record & Replay** mode proxies real APIs and saves responses as fixtures for deterministic test playback. Chaos testing capabilities allow simulating failures and edge cases.

aimock runs daily against real provider APIs and catches response format changes within 24 hours, maintaining fixture compatibility. It is built entirely on Node.js builtins with no external dependencies.

# CAVEATS

Intended for **testing environments only**, not production deployment. Requires **Node.js** 20.15 or later for npx usage, or Docker for containerized deployment. The package is **@copilotkit/aimock**: plain `npx aimock` runs an unrelated npm package. The **aimock** binary needs **--config**, while the **llmock** binary is a narrower flag-driven CLI that takes **-f** and **--record**. Record mode requires valid API keys for the providers being recorded. Fixture format is specific to aimock and may need conversion from other mocking tools.

# HISTORY

aimock was created by the **CopilotKit** team and written in **TypeScript**. It was developed to address the challenge of testing AI applications that may touch multiple external services in a single request (LLMs, tool servers, vector databases, rerankers, and moderation layers), providing a single mock server that covers the entire agentic stack.

# SEE ALSO

[node](/man/node)(1), [npx](/man/npx)(1), [docker](/man/docker)(1)

# RESOURCES

```[Source code](https://github.com/CopilotKit/aimock)```

```[Homepage](https://aimock.copilotkit.dev)```

```[Documentation](https://aimock.copilotkit.dev/docs)```

<!-- verified: 2026-11-09 -->
