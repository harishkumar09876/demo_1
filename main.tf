provider "aws" {
  region     = var.aws_region
  access_key = var.AWS_ACCESS_KEY
  secret_key = var.AWS_SECRET_KEY
}
 
resource "aws_instance" "example" {
  ami           = "ami-0c55b159cbfafe1f0"  # Example AMI ID, use a valid one for your region
  instance_type = "t2.micro"
  
  tags = {
    Name = "Jenkins-Terraform-Instance"
  }
}
