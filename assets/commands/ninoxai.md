# TAGLINE

Local-first read-only AI SRE for alert triage and incident investigation

# TLDR

**Start** the web dashboard

```python -m ninoxai serve```

**Import** alerts from a JSON file

```python -m ninoxai import data/mock_alerts.json```

**Recluster** alerts and refresh recommendations

```python -m ninoxai reprocess```

**Generate** mock alert data for testing

```python -m ninoxai generate-mocks```

**Run** with Docker Compose

```docker compose up --build```

# SYNOPSIS

**ninoxai** _subcommand_

# PARAMETERS

**serve**
> Start the dashboard and API on port 8765 by default

**import** _file_
> Load alerts from JSON or CSV

**reprocess**
> Normalize, cluster, score noise, and rebuild recommendations

**generate-mocks**
> Create synthetic alert data for offline demos

**investigate**
> Run the read-only AI investigator against an incident

# DESCRIPTION

**ninoxai** (also known as Nightwatch) is an open-source AI SRE layer that sits above monitoring systems such as Prometheus, Checkmk, Icinga2, Zabbix, and generic webhooks. It ingests non-OK alerts, groups related noise into incidents, scores flaky checks, and proposes tuning recommendations.

The tool is read-only by design. It observes live systems through typed allowlisted capabilities for Docker, Kubernetes, AWS, Grafana, GitHub, Git mirrors, and host metrics, then forms a root-cause hypothesis and suggests fixes for human approval. It does not execute remediation, acknowledge alerts, or write back to production.

A **template** LLM mode works fully offline with no API keys for summaries and rule-based recommendations. Connecting Anthropic, OpenAI, Mistral, or a local model enables the investigator agent.

Distributed **ninox** runners can expose read-only capabilities from environments the central brain cannot reach directly. Runners dial out over outbound-only connections and keep credentials local.

# CONFIGURATION

**.env**
> Sets **NINOXAI_SECRET_KEY** and optional LLM provider credentials

**docker-compose.yml**
> Runs the dashboard, database, and optional embedding services together

**/connections** in the UI
> Stores encrypted credentials for monitoring connectors

# CAVEATS

Remote LLM providers receive redacted alert and investigation context. Use the offline **template** provider if no data should leave the host.

Connector adapters are read-only, but misconfigured credentials can still expose sensitive infrastructure metadata to the dashboard and investigator.

Sandbox verification features require Docker and are marked beta.

# SEE ALSO

[docker](/man/docker)(1), [kubectl](/man/kubectl)(1), [python](/man/python)(1)