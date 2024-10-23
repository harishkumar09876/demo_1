provider "aws" {
  region     = us-east-1
  access_key = AKIATJHQD6OKL4DSXK46
  secret_key = WnR5TT30YHKT+L5FfREqm46o4sbyHk38nC4UhO1M
}
 
resource "aws_instance" "example" {
  ami           = "ami-0866a3c8686eaeeba"
  instance_type = "t2.micro"
}
