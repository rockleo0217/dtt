.PHONY: run
run: ## Run docker services
	docker compose up -d zookeeper kafka
.PHONY: stop
stop: ## Stop docker services
	docker compose down
