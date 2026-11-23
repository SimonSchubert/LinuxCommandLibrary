# TAGLINE

Local-first read-only AI SRE for alert triage and incident investigation

# TLDR

**Start** the web dashboard

```ninoxai serve```

**Import** alerts from a JSON file

```ninoxai import [data/mock_alerts.json]```

**Recluster** alerts and refresh recommendations

```ninoxai reprocess```

**Generate** mock alert data for testing

```ninoxai generate-mocks```

**Investigate** a host or container with the AI agent

```ninoxai investigate --host [container_or_host] --provider [anthropic|openai|mistral]```

**Apply** database migrations

```ninoxai migrate```

**Run** a distributed read-only ninox runner

```ninoxai runner```

**Run** with Docker Compose

```docker compose up --build```

# SYNOPSIS

**ninoxai** _subcommand_ [_options_]

**python -m ninoxai** _subcommand_ [_options_]

# PARAMETERS

**serve**
> Start the dashboard and API (port 8765 by default) plus the background source poller

**import** _file_
> Load alerts from JSON or CSV

**reprocess**
> Normalize, cluster, score noise, and rebuild recommendations

**generate-mocks**
> Create 500 reproducible mock alerts in **data/mock_alerts.json** for offline demos

**migrate**
> Apply database migrations (alembic upgrade head)

**seed** _file_
> Idempotently bind sources and repositories from a JSON file

**poll-sources-once**
> Run one poll cycle over all UI-configured sources

**investigate** **--host** _target_ [**--provider** _name_]
> Run the read-only AI investigator against a container or host; needs a tool-calling LLM provider

**runner**
> Run a ninox: an outbound-only, read-only runner that exposes local capabilities to the central instance

**llm-test**, **grafana-test**, **github-test**, **host-test**, **aws-test**, **k8s-test**, **mcp-test**
> Smoke-test the LLM provider or an investigator capability

# DESCRIPTION

**ninoxai** (published as the **nightwatch** repository) is an open-source AI SRE layer that sits above monitoring systems such as Prometheus Alertmanager, Checkmk, Icinga2, Zabbix, and generic webhooks, plus JSON/CSV import. It ingests non-OK alerts, groups related noise into incidents, scores flaky checks, and proposes tuning recommendations.

The tool is read-only by design. It observes live systems through typed allowlisted capabilities for Docker, Kubernetes, AWS, Grafana, GitHub, Git mirrors, and host metrics, then forms a root-cause hypothesis and suggests fixes for human approval. It does not execute remediation, acknowledge alerts, or write back to production.

A **template** LLM mode works fully offline with no API keys for summaries and rule-based recommendations. Connecting a tool-calling provider (Anthropic, Mistral, or OpenAI-compatible endpoints including local Ollama, vLLM or LM Studio) enables the investigator agent. Additional tools can be added through MCP servers or Python capability plugins.

Distributed **ninox** runners can expose read-only capabilities from environments the central brain cannot reach directly. Runners dial out over outbound-only connections and keep credentials local.

# CONFIGURATION

**.env**
> Sets **NINOXAI_SECRET_KEY** and optional LLM provider credentials

**docker-compose.yml**
> Runs the dashboard, database, and optional embedding services together

**/connections** in the UI
> Stores encrypted credentials for monitoring connectors

# CAVEATS

Remote LLM providers receive redacted and secret-scrubbed alert and investigation context. Use the offline **template** provider if no data should leave the host.

Connector adapters are read-only, but misconfigured credentials can still expose sensitive infrastructure metadata to the dashboard and investigator.

Sandbox verification features require Docker and are marked beta.

The original upstream repository (github.com/ninoxAI/nightwatch) is no longer reachable; only third-party copies remain.

# SEE ALSO

[docker](/man/docker)(1), [kubectl](/man/kubectl)(1), [python](/man/python)(1)