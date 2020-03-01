# To run the api server locally
`$ sam local start-api --template sam.jvm.yaml`

# To invoke lambda locally

`$ sam local invoke --template sam.jvm.yaml --event payload.json`, test event inn `payload.json`

# To deploy the lambda

`$ sam deploy --guided  --template sam.jvm.yaml`

